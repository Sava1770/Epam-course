import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchWordsInFiles implements Runnable {

    private String letter = "w";
    private BlockingQueue<File> queue;

    public SearchWordsInFiles(BlockingQueue<File> queue){
        this.queue = queue;
    }

    private int searchWords(File file){

        int i = 0;

        try {
            Scanner sc = new Scanner(new FileReader(file));

            Pattern pattern = Pattern.compile("^" + letter + ".*");

            while(sc.hasNext()){
                Matcher m = pattern.matcher(sc.next());

                if( m.matches()){
                    i++;
                }
            }

            sc.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return i;
    }

    private void writeInFile(String fileName, int repeatsCount){
        try {
            System.out.println(repeatsCount);
            FileWriter writer = new FileWriter(new File("C:/Users/romao/IdeaProjects/Epam/task8/task8_5/src/main/resources/words.txt"), true);
            writer.write( " in file " + fileName + " found " + repeatsCount + " words started with specified letter (" + letter + ")\n");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public void run(){
        try{
            while (true){
                File currentFile = queue.take();
                if(currentFile == FilesSearch.EXIT){
                    //queue.put(currentFile);
                    break;
                }else{
                    writeInFile(currentFile.getName(), searchWords(currentFile));
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
