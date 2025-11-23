public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, int hireYear, int hireMonth, int hireDay, String department) {
        super(name, salary, hireYear, hireMonth, hireDay);
        this.department = department;
    }

    public static void UpSalary(Employee[] employees, double percentage) {
        for (Employee employee : employees){
            if (!(employee instanceof Manager)) {
                double currentSalary = employee.getSalary();
                employee.setSalary(currentSalary * (1 + percentage/100));
            }
        }
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return String.format("Руководитель: %s, Зарплата: %.2f, Дата приема: %d-%02d-%02d, Отдел: %s", name, salary, hireYear, hireMonth, hireDay, department);
    }
    
}
