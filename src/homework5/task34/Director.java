package homework5.task34;

public class Director implements Calculateable {

    public String name;
    public double salary;

    public Director() {
    }

    public Director(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void payASalary() {
        System.out.println("Это ваша зарплата");
    }

    @Override
    public void calculateSalary() {
        System.out.println("Этот метод вычисляет смешаную зарплату");
    }
}
