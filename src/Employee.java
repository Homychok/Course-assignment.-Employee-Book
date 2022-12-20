public class Employee {
    private int department;
    private String fullName;
    private int id;
   private int salary;
    private static int count = 0;
//    private Main newSalary;
    /**
     * Конструктор может принимать имя и фамилию, отдел, зп.
     * @param fullName имя.
     * @param department фамилия.
     * @param salary жалование.
     * увеличение id на 1
     */
    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++count;
    }
/*    public void employee1(String fullName, int department, Main newSalary) {
        this.fullName = fullName;
        this.department = department;
        this.newSalary = newSalary;
        id = ++count;
    }
*/
    /**
     * Метод получения id.
     * @return id.
     */
    public int getId() {
        return id;
    }
    /**
     * Метод получения имени.
     * @return имя.
     */
        public String getFullName() {
        return this.fullName;
    }
    /**
     * Метод получения отдела.
     * @return отдела.
     */
    public int getDepartment() {
        return this.department;
    }
    /**
     * Метод получения зп.
     * @return зп.
     */
    public int getSalary() {
        return this.salary;
    }
    /**
     * Метод изменения зп.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    /**
     * Метод изменения отдела.
     */
    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Сотрудник id " + id + ". " + fullName + ". " + department + ". " + salary;
    }

/*    public Main getNewSalary() {
        return newSalary;
    }

    public void setNewSalary(Main newSalary) {
        this.newSalary = newSalary;
    } */
}



