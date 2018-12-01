public class Main {

    public static void main(String [] args){
        Thread thread = new Thread(new Runner());
        thread.start();
    }
}
