public class EmployeeService {

    private static int n = 0;
    public static Employee[] employee = new Employee[10];
    public static void addEmployee(String fullName, int salary, int department) {
        employee[n] = new Employee(fullName, salary, department);
        n++;
    }
    public static int salarySum() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += employee[i].getSalary();
        }
        return sum;
    }

    public static int minSalary() {
        int min = employee[0].getSalary();
        for (int i = 1; i < n; i++) {
            if (min > employee[i].getSalary()){
                min = employee[i].getSalary();
            }
        }
        return min;
    }

    public static int maxSalary() {
        int max = employee[0].getSalary();
        for (int i = 1; i < n; i++) {
            if (max < employee[i].getSalary()) {
                max = employee[i].getSalary();
            }
        }
        return max;
    }

    public static int meanSalary() {
        return salarySum() / n;
    }

    public static String printFullName(){
        String fullName = "";
        for (int i = 0; i < n; i++) {
            fullName += employee[i].getFullName() + "\n";
        }
        return fullName;
    }

}
