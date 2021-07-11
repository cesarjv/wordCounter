public class App {
    public static void main(String[] args) throws Exception {
        String text="Un escrito es cualquier tipo de texto que se realiza con la finalidad de transmitir una idea, un mensaje, una opinión, un sentimiento, una crítica, una descripción o cualquier tipo de discurso que se quiera. ...";
        WordCounter wordCounter= new WordCounter();
        wordCounter.wordCounterFunction(text);
    }
}
