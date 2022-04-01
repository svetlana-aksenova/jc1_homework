package homework4;

public class Task31 {

    public static void main(String[] args) {

        String s1 = "aaa";
        String s2 = "bbb";

        long timeStart1 = System.currentTimeMillis();
        buildString(s1, s2);
        long timeEnd1 = System.currentTimeMillis();

        long timeStart2 = System.currentTimeMillis();
        buildStringBuilder(s1, s2);
        long timeEnd2 = System.currentTimeMillis();

        long time = (timeEnd1 - timeStart1) - (timeEnd2 - timeStart2);
        System.out.println(timeEnd2 - timeStart2);


    }

    public static String buildString(String s1, String s2) {
        String result = "";
        for (int i = 1; i <= 1000000; i++) {
            result = result + s1 + s2;
        }
        return result;
    }

    public static String buildStringBuilder(String s1, String s2) {
        StringBuilder result = new StringBuilder("");
        for (int i = 1; i <= 1_000_000; i++) {
            result.append(s1);
            result.append(s2);
        }
        return result.toString();

    }

}
