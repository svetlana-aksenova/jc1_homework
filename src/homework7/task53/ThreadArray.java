package homework7.task53;

import static homework7.task53.GenerateArray.findMaxElement;

public class ThreadArray implements Runnable {
    private final Thread thread;
    private final int[] array;

    public ThreadArray(String threadName, int[] array) {
        thread = new Thread(this, threadName);
        this.array = array;
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + ". Max element: " + findMaxElement(array));
    }


}
