import java.util.Arrays;
import java.util.Set;

public class Main {
    static int num = 10;
    static Employee[] employees = new Employee[num];
//    static Employee[] employees1 = new Employee[num];

    private int size;

    public static void printemployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static Employee minSalary() {
        int minSalary = (int) employees[0].getSalary();
        int min = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null & employees[i].getSalary() < minSalary) {
                minSalary = (int) employees[i].getSalary();
                min = i;
            }
        }
        return employees[min];
    }

    public static Employee maxSalary() {
        int maxSalary = (int) employees[0].getSalary();
        int max = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null & employees[i].getSalary() > maxSalary) {
                maxSalary = (int) employees[i].getSalary();
                max = i;
            }
        }
        return employees[max];
    }

    public static int sumSalary() {
        int sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sumSalary = (int) (sumSalary + employees[i].getSalary());
            }
        }
        return sumSalary;
    }

    public static int averageSalary() {
        int sumSalary = 0;
        int averageSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sumSalary = (int) (sumSalary + employees[i].getSalary());
                averageSalary = sumSalary / num;
            }
        }
        return averageSalary;
    }

    public static void allListOfEmployees() {
        String employee;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employee = employees[i].getFullName();
                System.out.println(employee);
            }
        }
    }

/*    public int indexSalary(Employee[] employees) {
        double sumSalary = 0;
        int indexSalary = (int) 0.05d;
        int newSalary = indexSalary * (int) employees[0].getSalary() + (int) employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                newSalary = indexSalary * (int) employees[i].getSalary() + (int) employees[0].getSalary();
            }
        }
        return (int) newSalary;
    }
*/
    public static void main(String[] args) {
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
        System.out.println("Полный список сотрудников: ");
        allListOfEmployees();
        System.out.println(employees.length + " человек всего в компании");
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalary());
        System.out.println("Сумма, затрачиваемая на зарплаты: " + sumSalary());
        System.out.println("Средняя зарплата составляет: " + averageSalary());
/*        printEmployeesNew(employees);
        //System.out.println(indexSalary());
//        Employee[] employees1 = new Employee[10];
//
  //      System.arraycopy(employees, 0, employees1, 0, 10);
       System.out.println(Arrays.toString(employees1));
 */    }
    }







