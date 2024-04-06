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
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
            sum += employee[i].getSalary();
                sumEmployees++;
            }
        }
        System.out.println("Сумма затрат на з/п в месяц составляет: " + sum);
        //max salary
        double maxSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
            }
        }
        System.out.println("Максимальная з/п среди сотрудников = " + maxSalary);
        //min salary
        double minSalary = maxSalary;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
            }
        }
        System.out.println("Минимальная з/п среди сотрудников = " + minSalary);
        //salary average
        double salaryAverage = sum / sumEmployees;
        System.out.println("Среднее значение зарплат = " + salaryAverage);
        //employees' full names
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getFullName());
            }
        }
        //increase salary for all
        double percent = 5 / 100;
        double newSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                newSalary = employee[i].getSalary() + employee[i].getSalary() * percent;
                employee[i].setSalary(newSalary);
            }
        }
        //by department
        //max salary
        int department = 1;
        double maxSalary2 = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department && employee[i].getSalary() > maxSalary2) {
                maxSalary2 = employee[i].getSalary();
            }
        }
        System.out.println("Максимальная з/п среди сотрудников отдела " + department + " = " + maxSalary2 );
        //min salary
        double minSalary2 = maxSalary2;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department && employee[i].getSalary() < minSalary2) {
                minSalary2 = employee[i].getSalary();
            }
        }
        System.out.println("Минимальная з/п среди сотрудников отдела " + department + " = " + minSalary2 );
        //sum
        int sumEmployees2 = 0;
        double sum2 = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                sum2 += employee[i].getSalary();
                sumEmployees2++;
            }
        }
        System.out.println("Сумма затрат на з/п в месяц по отделу " + department + " составляет: " + sum2);
        //salary average
        double salaryAverage2 = sum2 / sumEmployees2;
        System.out.println("Среднее значение зарплат по отделу " + department + " = " + salaryAverage2);
        //increase salary for department
        double percent2 = 10 / 100;
        double newSalary2 = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                newSalary2 = employee[i].getSalary() + employee[i].getSalary() * percent2;
                employee[i].setSalary(newSalary2);
            }
        }
        //array department
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                System.out.println(employee[i].toString2());
            }
        }
        //less than
        double givenParameter = 100000;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < givenParameter) {
                System.out.println(employee[i].toString2());
            }
        }
        //more than
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() > givenParameter) {
                System.out.println(employee[i].toString2());
            }
        }
    }
}
