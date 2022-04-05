package homework5.task32;

public class RobotVacuumCleaner extends VacuumCleaner implements Workable {

    protected int chargingTime;

    public RobotVacuumCleaner() {

    }

    public RobotVacuumCleaner(double width, double lenght, double height,
                              boolean wetСleaning, int chargingTime) {
        super(width, lenght, height, wetСleaning);
        this.chargingTime = chargingTime;
    }

    @Override
    public void plugIn() {
        System.out.println("Robot vacuum cleaner is plug in and charging");
    }

    @Override
    public void unplug() {
        System.out.println("Robot vacuum cleaner is unplug");

    }

    @Override
    public void work() {
        System.out.println("Man turns on the vacuum cleaner and robot is vacuuming");
    }

    @Override
    public void stop() {
        System.out.println("The vacuum cleaner finished working and arrived at the base");

    }
}
