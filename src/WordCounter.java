import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordCounter {

    public String text;
    
    public String newTextReplaced;

    public int i;
    
    void wordCounterFunction (String text){

        newTextReplaced=text.replaceAll("[-+.^:,]","").toLowerCase();
        List<String> word= new ArrayList<>(Arrays.asList(newTextReplaced.split(" ")));
        HashMap<String, Integer> counterWord= new HashMap<String,Integer>();
        for (String x:word){
            if (counterWord.containsKey(x)){
                int i=counterWord.get(x);
                i+=1;
                counterWord.put(x, i);
            }
            else{
                counterWord.put(x,1);
            }
        }
        System.out.println(Arrays.asList(counterWord));
    }
   
}
