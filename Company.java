public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Natalia Setniewska", 90000);
        employees[1] = new Employee("Tomasz Czabros", 60000);
        employees[2] = new Employee("Kacper Guzik", 75000);
        employees[3] = new Employee("Tosia Kosińska", 55000);
        employees[4] = new Employee("Kacper Bąk", 20000);

        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(6000);

        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}