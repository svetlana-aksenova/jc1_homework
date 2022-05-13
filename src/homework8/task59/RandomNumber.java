package homework8.task59;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber implements Callable<String> {

    private ArrayList<Integer> createList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(getRandomNumber());
        }
        return list;
    }

    private static int getRandomNumber() {
        return ThreadLocalRandom.current().nextInt(0, 101);
    }

    private int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += list.get(i);
        }
        return sum;
    }

    private String getResult(int a) {
        return "Thread " + Thread.currentThread().getName() + ". Sum of numbers: " + a;
    }

    @Override
    public String call() throws Exception {
        ArrayList<Integer> list = createList();
        Thread.sleep(getSeconds());
        int sum = getSum(list);
        return getResult(sum);
    }

    private long getSeconds() {
        return ThreadLocalRandom.current().nextInt(1, 10 + 1);
    }
}
