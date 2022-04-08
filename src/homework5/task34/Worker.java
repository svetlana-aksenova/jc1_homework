package homework5.task34;

public class Worker extends HeadOfDepartment {

    protected int hoursWorked;

    public Worker() {

    }

    public Worker(String name, double salary, String department, int hoursWorked) {
        super(name, salary, department);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Этот метод вычисляет почасовую зарплату");
    }


}
