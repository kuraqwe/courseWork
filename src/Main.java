public class Main {

    public static void main(String[] args) {
        EmployeeService.addEmployee("Рыков Ростислав Юрьевич", 200000, 4);
        EmployeeService.addEmployee("Мельниченко Владимир Тудорович", 100000, 1);
        EmployeeService.addEmployee("Дроздов Василий Валерьевич", 150000, 2);
        System.out.println(EmployeeService.maxSalary());
        System.out.println(EmployeeService.minSalary());
        System.out.println(EmployeeService.meanSalary());
        System.out.println(EmployeeService.salarySum());
        System.out.println(EmployeeService.printFullName());
    }

}