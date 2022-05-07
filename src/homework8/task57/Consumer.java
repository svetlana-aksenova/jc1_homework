package homework8.task57;

public class Consumer implements Runnable{

    private  final Thread thread;
    private final MyQueue queue;

    public Consumer(String treadName, MyQueue queue) {
        this.thread = new Thread(this, treadName);
        this.queue = queue;
        this.thread.start();
    }

    @Override
    public void run() {
        queue.removeElement();
    }
}
