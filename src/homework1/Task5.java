package homework1;

public class Task5 {
    public static void main(String[] args) {

        int interval = 15071218;
        int seconds = interval % 60;
        int remainderMin = (interval - seconds) / 60;
        int minits = remainderMin % 60;
        int remainderHours = (remainderMin - minits) / 60;
        int hours = remainderHours % 24;
        int remainderDays = (remainderHours - hours) / 24;
        int days = remainderDays % 7;
        int weeks = (remainderDays - days) / 7;
        System.out.print(hours + " часов " + minits + " минут " + seconds + " секунд ");
        System.out.println(days + " суток " + weeks + " недель ");


    }


}
