package homework8.task55;

public class Go {

    private Flag flag;

    public Go() {
        flag = new Flag();
        flag.setFree(true);
    }

    public void enter() {
        synchronized (flag) {
            while (!flag.isFree()) {
                try {
                    flag.wait();
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            flag.setFree(false);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public void exit() {
        synchronized (flag) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
            flag.setFree(true);
            flag.notifyAll();
        }
    }

}
