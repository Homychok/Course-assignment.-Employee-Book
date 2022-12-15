import java.util.Arrays;

public class Main {
    public static void printemployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", 1, 10_000);
        employees[1] = new Employee("Petrov Peter Petrovich", 2, 15_000);
        employees[2] = new Employee("Frolov Ivan Nikolaevich", 3, 20_000);
        employees[3] = new Employee("Kuznetsov Ivan Petrovich", 1, 40_000);
        employees[4] = new Employee("Sokolov Artem Vasilevich", 2, 60_000);
        employees[5] = new Employee("Kuznetsov Ivan Ivanovich", 3, 10_000);
        employees[6] = new Employee("Kuznetsov Peter Petrovich", 1, 70_000);
        employees[7] = new Employee("Frolov Peter Nikolaevich", 2, 50_000);
        employees[8] = new Employee("Frolov Ivan Petrovich", 3, 40_000);
        employees[9] = new Employee("Frolov Peter Ivanovich", 2, 30_000);
        printemployees(employees);
        System.out.println(employees.length + " человек всего в компании");
        int[] department = {1, 2, 3};

    }



}

