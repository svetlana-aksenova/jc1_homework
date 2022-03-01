package homework1;

public class Task3 {
    public static void main(String[] args) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char c = 'a';
        float f = .25f;
        double d = .00001234;
        boolean bool = true;

        System.out.println( "byte b = " + "0x" + Integer.toString(b,16) + ";");
        System.out.println("short s = " + "0x" + Integer.toString(s,16)+ ";");
        System.out.println("int i = " + i + ";");
        System.out.println("long l = " + "0x" + Long.toString(l,16) + ";");
        System.out.println("char c = " + "'" + c+ "'" + ";");
        System.out.println("float f = " + f + "f" + ";");
        System.out.println("double d = " + d + ";");
        System.out.println("boolean bool = " + bool + ";");






    }
}
