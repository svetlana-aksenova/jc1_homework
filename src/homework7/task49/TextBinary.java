package homework7.task49;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TextBinary {

    private String pathToFile;

    public TextBinary(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public void writeBinary(ListOfNumbers listOfNumbers) {
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(pathToFile)))) {
            for (Integer number : listOfNumbers.getListOfNumbers()) {
                dos.writeInt(number);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            ;
        }
    }

    public ArrayList<Integer> readBinary() {
        ArrayList<Integer> list = new ArrayList<>();
        try (DataInputStream ins = new DataInputStream(new FileInputStream(pathToFile))) {
            while (ins.available() > 0) {
                list.add(ins.readInt());
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return list;
    }


    private int getRandomNumber() {
        Random random = new Random();
        int a = random.nextInt(100);
        return a;
    }

    public static int addSize() {
        System.out.println("Enter the required number of numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;

    }
}
