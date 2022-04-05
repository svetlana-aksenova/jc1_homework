package homework5.task32;

public class VacuumCleaner extends HomeAppliances implements Workable, Stoppable {

    protected boolean wetСleaning;

    public VacuumCleaner() {

    }

    public VacuumCleaner(double width, double lenght, double height, boolean wetСleaning) {
        super(width, lenght, height);
        this.wetСleaning = wetСleaning;
    }


    @Override
    public void plugIn() {
        System.out.println("Vacuum cleaner is plug in and ready to work");
    }

    @Override
    public void unplug() {
        System.out.println("Vacuum cleaner is unplug");

    }

    @Override
    public void work() {
        System.out.println("Man turns on the vacuum cleaner and vacuums");
    }

    @Override
    public void stop() {
        System.out.println("The man finished vacuuming and turned off the vacuum cleaner");
    }

    public boolean isWetСleaning() {
        return wetСleaning;
    }
}
