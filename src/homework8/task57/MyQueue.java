package homework8.task57;

import java.util.ArrayDeque;
import java.util.Random;

public class MyQueue {

    private ArrayDeque<Integer> element;
    private int processedElement = 0;

    public MyQueue(int capacity) {
        this.element = new ArrayDeque<>(capacity);
        fillQueue(capacity);
    }

    private void fillQueue(int capacity) {
        if (capacity <= 0) {
            System.out.println("Incorrect data. Need capacity>0.");
        } else {
            for (int i = 0; i < capacity; i++) {
                element.add(getRandomNumber());
            }
        }
    }

    private int getRandomNumber() {
        Random random = new Random();
        return (int) (Math.random() * 100 + 1);
    }

    public synchronized void addElement() {
        while (element.size() >= 100) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        if (element.size()<=80) {
            element.add(getRandomNumber());
            notifyAll();
        }
    }


    public synchronized void removeElement() {
        if (element.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            notifyAll();
            System.out.println(element.element());
            element.remove(0);
            processedElement++;
        }
        if (isContinue()) {
            System.exit(0);
        }
    }

    private boolean isContinue() {
        if (processedElement<10) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return element.toString();
    }

}


