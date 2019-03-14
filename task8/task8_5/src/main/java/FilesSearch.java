import java.io.File;
import java.util.concurrent.BlockingQueue;

public class FilesSearch implements Runnable {

    private BlockingQueue<File> queue;
    private File startDir ;
    public static final File EXIT = new File("");

    public FilesSearch(File startDir, BlockingQueue<File> queue){

        this.startDir = startDir;
        this.queue = queue;
    }

    private void runDir(File startDir) throws InterruptedException{

        File[] allFiles = startDir.listFiles();

        for(File file : allFiles) {
            if (file.isDirectory()) {
                runDir(file);
            } else {
                queue.put(file);
            }
        }
        queue.put(EXIT);
            Thread thread = new Thread(new SearchWordsInFiles(queue));
            thread.start();
            thread.join();

    }

    public void run(){
        try{
            runDir(startDir);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
