import java.sql.Array;

public class Main {
    static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        employee[0] =  new Employee("Рыков Ростислав Юрьевич", 200000, 4);
        employee[1] =new Employee("Мельниченко Владимир Тудорович", 100000, 1);
        employee[2] = new Employee("Дроздов Василий Валерьевич", 150000, 2);
        int n = 3;
    }

}