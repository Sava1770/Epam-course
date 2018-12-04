import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args){
        BlockingQueue<File> que = new ArrayBlockingQueue<>(10);
        //make path
        FilesSearch running = new FilesSearch(new File("C:\\Users\\romao\\DIR"),que);
        new Thread(running).start();
    }
}
