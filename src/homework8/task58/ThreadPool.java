package homework8.task58;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPool {

    public static void begin() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<CopyOnWriteArrayList<String>>> list = new ArrayList<>();
        Callable<CopyOnWriteArrayList<String>> callable = new MyCallable();
        for (int i = 0; i < 10; i++) {
            Future<CopyOnWriteArrayList<String>> future = executor.submit(callable);
            list.add(future);
        }
        for (Future<CopyOnWriteArrayList<String>> fut : list) {
            try {
                System.out.println(fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
