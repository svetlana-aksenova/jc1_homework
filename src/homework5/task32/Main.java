package homework5.task32;

public class Main {

    public static void main(String[] args) {

        VacuumCleaner cleaner1 = new VacuumCleaner(20, 20, 8, true);
        VacuumCleaner cleaner2 = new VacuumCleaner();
        RobotVacuumCleaner roboCleaner = new RobotVacuumCleaner();
        RobotVacuumCleaner roboCleaner2 = new RobotVacuumCleaner(12, 12, 10, true, 6);

        cleaner2.plugIn();
        roboCleaner.plugIn();

        System.out.println();

        cleaner1.plugIn();
        cleaner1.work();

        roboCleaner.work();

        System.out.println(cleaner1.getHeight());
        roboCleaner.setWidth(10.0);
        System.out.println(roboCleaner.getWidth());

        cleaner2.stop();
        roboCleaner.stop();


    }
}
