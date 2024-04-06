public class Main {
    private static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee("Shishkin Alexandr Petrovich", 1, 120000);
        employee[1] = new Employee("Kireev Vladislav Olegovich", 1, 95000);
        employee[2] = new Employee("Novitskiy Konstantin Pavlovich", 3, 178000);
        employee[3] = new Employee("Aksyomov Svyatoslav Rodionovich", 2, 77000);
        employee[4] = new Employee("Boyko Svetlana Grigoryevna", 3, 110000);
        //full array
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
        //sum
        int sumEmployees = 0;
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
            sum += employee[i].getSalary();
                sumEmployees++;
            }
        }
        System.out.println("Сумма затрат на з/п в месяц составляет: " + sum);
        //max salary
        int maxSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
            }
        }
        System.out.println("Максимальная з/п среди сотрудников = " + maxSalary);
        //min salary
        int minSalary = maxSalary;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
            }
        }
        System.out.println("Минимальная з/п среди сотрудников = " + minSalary);
        //salary average
        int salaryAverage = sum / sumEmployees;
        System.out.println("Среднее значение зарплат = " + salaryAverage);
        //employees' full names
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getFullName());
            }
        }
    }
}
