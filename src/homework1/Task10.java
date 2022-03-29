package homework1;

public class Task10 {
    public static void main(String[] args) {
        double a, b, c, d, e, f;
        double length1, length2, length3, width1, width2, width3;
        a = 2;
        b = 1;
        c = 2;
        d = 2;
        e = 3;
        f = 2;

        if (a > b) {
            length1 = a;
            width1 = b;
        } else {
            length1 = b;
            width1 = a;
        }

        if (c > d) {
            length2 = c;
            width2 = d;
        } else {
            length2 = d;
            width2 = c;
        }

        if (e > f) {
            length3 = e;
            width3 = f;
        } else {
            length3 = f;
            width3 = e;
        }


        if ((width1 + width2) <= width3 && length1 <= length3 && length2 <= length3) {
            System.out.println("Дома поместятся на учаске");
        } else if ((length1 + length2) <= length3 && width1 <= width3 && width2 <= width3) {
            System.out.println("Дома поместятся на участке");
        } else if ((length1 + width2) < length3 && width1 <= width3 && length2 <= width3) {
            System.out.println("Дома помещаются на участке");
        } else {
            System.out.println("Дома не помещаются на участке");
        }
    }

}
