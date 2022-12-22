public class EmployeeService {

    public static int salarySum(Employee[] employees, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static int minSalary(Employee[] employees, int n) {
        int min = employees[0].getSalary();
        for (int i = 1; i < n; i++) {
            if (min > employees[i].getSalary()){
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public static int maxSalary(Employee[] employees, int n) {
        int max = employees[0].getSalary();
        for (int i = 1; i < n; i++) {
            if (max < employees[i].getSalary()) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    public static int meanSalary(Employee[] employees, int n) {
        return salarySum(employees, n) / n;
    }

    public static String printFullName(Employee[] employees, int n){
        String fullName = "";
        for (int i = 0; i < n; i++) {
            fullName += employees[i].getFullName() + "\n";
        }
        return fullName;
    }
}
