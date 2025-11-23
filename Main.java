public class Main {
    public static void main (String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new Employee("Иван Иванов", 50000, 2025, 11, 23);
        employees[1] = new Employee("Петр Петров", 70000, 2024, 10, 24);
        employees[2] = new Employee("Иван Петров", 60000, 2023, 12, 12);
        employees[3] = new Manager ("Иван Иванович", 100000, 2025, 11, 20, "ItSec");

        System.out.println("До повышения з/п");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Manager.UpSalary(employees, 10);

        System.out.println("После повышения з/п");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        System.out.println ("\n тестирование компаратора дат");
        testDateComparator();
    }

    public static void testDateComparator() {
        int result1 = Employee.compareDate(2025, 11, 23, 2024, 10, 24);
        System.out.println("Сравнение 2025-11-23 и 2024-10-24" + result1);

        int result2 = Employee.compareDate(2023, 12, 12, 2023, 12, 12);
        System.out.println("Сравнение 2023-12-12 и 2023-12-12" + result2);

        int result3 = Employee.compareDate(2025, 11, 23, 2023, 12, 12);
        System.out.println("Сравнение 2025-11-23 и 2023-12-12" + result3);

    }
    
}
