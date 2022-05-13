package homework8.task55;

public class Program {
    static Go go = new Go();

    public static void start() {
        for (int i = 1; i <= 10; i++) {
            MyThread myThread = new MyThread(go, "MyTread " + i);
            go.enter();
            new Thread(myThread, myThread.getThreadName()).start();
            go.exit();
        }
    }
}
