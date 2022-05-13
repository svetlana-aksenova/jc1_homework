package homework8.task60;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TreadPool {
    public static void begin() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> list = new ArrayList<Future<String>>();
        Callable<String> hello = new HelloWorld("C:/HW directory");
        for (int i = 0; i < 10; i++) {
            Future<String> future = executor.submit(hello);
            list.add(future);
        }
        for (Future<String> fut : list) {
            try {
                System.out.println(fut.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        executor.shutdown();
    }
}
