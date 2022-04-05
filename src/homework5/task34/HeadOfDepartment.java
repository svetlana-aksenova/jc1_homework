package homework5.task34;

public class HeadOfDepartment extends Director {

    public String department;

    public HeadOfDepartment() {
    }

    public HeadOfDepartment(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Этот метод вычисляет процентную зарплату");
    }


}
