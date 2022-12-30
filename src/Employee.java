public class Employee {

     private static int count = 0;
    private String fullName;
    private int salary, department, id;

    public Employee(String fullName, int salary, int department) {
        this.department = department;
        this.salary = salary;
        this.fullName = fullName;
        this.id = count;
        count++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id " + id + ", имя " + fullName + ", отдел " + department + ", зарплата " + salary;
    }

}
