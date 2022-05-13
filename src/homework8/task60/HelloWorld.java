package homework8.task60;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.Callable;

public class HelloWorld implements Callable<String> {

    private String path;

    public HelloWorld(String path) {
        this.path = path;
    }

    public static synchronized String createString() {
        Date date = new Date();
        String s = Thread.currentThread().getName() + "Hello World" + date.toString();
        return s;
    }

    public synchronized String writeToFile(String path) {
        String s = createString();
        Date date = new Date();
        File file = new File(path, Thread.currentThread().getName()+ date.toString()) ;
        FileWriter fw = null;
        try {
            fw.write(s);
        } catch (IOException e) {
            System.out.println("Error: file write failed" + e.getMessage());
            try {
                fw.close();
            } catch (IOException ex) {
                System.out.println("Error: ");
            }
        }
        return s;
    }

    @Override
    public String call() throws Exception {
        writeToFile(path);
        return null;
    }
}
