package homework7.task52;

import java.util.ArrayList;

import static homework7.task49.ListOfNumbers.getAverage;

public class ThreadAverage implements Runnable {

    private final Thread thread;
    private final ArrayList<Integer> list;


    public ThreadAverage(String threadName, ArrayList<Integer> list) {
        thread = new Thread(this, threadName);
        this.list = list;
        thread.start();
    }

    @Override
    public void run() {

        System.out.println(thread.getName() + ". Average: " + getAverage(list));
    }
}
