package homework8.task58;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class MyCallable implements Callable<CopyOnWriteArrayList<String>> {

    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static int getStringLength() {
        return ThreadLocalRandom.current().nextInt(4, 10);
    }

    public static CopyOnWriteArrayList<String> generateFiles() {
        String path = "C:/directory";
        File file = new File(path);
        if (file.mkdirs()) {
            System.out.println("Directory is created");
        }
        for (int i =1; i <= 10; i++) {
            try {
                 file = new File(path, "file" + i);
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                FileWriter fw = null;
                try {
                    fw = new FileWriter(file);
                    for (int j = 0; j<10; j++) {
                        fw.write(getRandomString(getStringLength()) + "\r\n");
                    }
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(getSeconds());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        File f = new File(path);
        File[] arrFiles = f.listFiles();
        for (int i = 0; i < arrFiles.length; i++) {
            list.add(arrFiles[i].getName());
        }
            return list;
    }

    @Override
    public CopyOnWriteArrayList<String> call() throws Exception {
        CopyOnWriteArrayList<String> list = generateFiles();
        return list;
    }

    private static long getSeconds() {
        return ThreadLocalRandom.current().nextInt(1, 3 + 1);
    }
}
