public class Employee {
    private int department;
    private String fullName;
    private int id;
   private double salary;
    private static int count = 0;

    private int totalSalary;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++count;
    }

    public int getId() {
        return id;
    }
        public String getFullName() {
        return this.fullName;
    }
    public int getDepartment() {
        return this.department;
    }
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Сотрудник id " + id + ". " + fullName + ". " + department + ". " + salary;
    }

    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }
}



