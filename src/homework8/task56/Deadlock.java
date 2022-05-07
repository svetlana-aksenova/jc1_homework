package homework8.task56;

public class Deadlock {

    private Object object1;
    private Object object2;
    private Object object3;

    public Deadlock() {
        object1 = new Object();
        object2 = new Object();
        object3 = new Object();
        threadsStart();
    }

    public void method1() {
        System.out.println(Thread.currentThread().getName() + " start");
        synchronized (object1) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
            synchronized (object2) {
            }
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }

    public void method2() {
        System.out.println(Thread.currentThread().getName() + " start");
        synchronized (object2) {
            try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
            synchronized (object3) {
            }
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }

    public void method3() {
        System.out.println(Thread.currentThread().getName() + " start");
        synchronized (object3) {
            synchronized (object1) {
            }
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }

    private void threadsStart() {
        new Thread(() -> method1()).start();
        new Thread(() -> method2()).start();
        new Thread(() -> method3()).start();
    }


}
