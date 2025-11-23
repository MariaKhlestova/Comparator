
public class Employee {
    protected String name;
    protected double salary;
    protected int hireYear;
    protected int hireMonth;
    protected int hireDay;

    public Employee (String name, double salary, int hireYear, int hireMonth, int hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.hireMonth = hireMonth;
        this.hireDay = hireDay;
    }

    public static int compareDate (int year1, int month1, int day1, int year2, int month2, int day2){
        int yearCompare = Integer.compare(year1, year2);
        int monthCompare = Integer.compare(month1, month2);
        int dayCompare = Integer.compare(day1, day2);

        return yearCompare != 0 ? yearCompare : (monthCompare != 0 ? monthCompare : dayCompare);
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int[] getHireDate() {
        return new int[]{hireYear, hireMonth, hireDay};
    }
    
    @Override
    public String toString() {
        return String.format("Сотрудник: %s, Зарплата: %.2f, Дата приема: %d-%02d-%02d", name, salary, hireYear, hireMonth, hireDay);
    }
}