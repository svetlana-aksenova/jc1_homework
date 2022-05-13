package homework8.task55;

public class MyThread implements Runnable {

    private Go go;
    private String threadName;

    public MyThread(Go go, String threadName) {
        this.go = go;
        this.threadName = threadName;

    }

    public String getThreadName() {
        return threadName;
    }

    @Override
    public void run() {
        System.out.printf("%s \n", Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
