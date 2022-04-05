package homework5.task34;

public class Main {

    public static void main(String[] args) {

        Director director = new Director("Иванов Петр", 1000.0);
        System.out.println(director.salary);
        director.calculateSalary();

        HeadOfDepartment headOfDepartment = new HeadOfDepartment();
        headOfDepartment.calculateSalary();

        Worker worker = new Worker();
        worker.calculateSalary();


    }

}
