public class Main {
    private static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        employee[0] = new Employee("Shishkin Alexandr Petrovich", 1, 120000);
        employee[1] = new Employee("Kireev Vladislav Olegovich", 1, 95000);
        employee[2] = new Employee("Novitskiy Konstantin Pavlovich", 3, 178000);
        employee[3] = new Employee("Aksyomov Svyatoslav Rodionovich", 2, 77000);
        employee[4] = new Employee("Boyko Svetlana Grigoryevna", 3, 110000);
        employee[5] = new Employee("Alexandrov Petr Afanasyevich", 2, 219000);
        employee[6] = new Employee("Lee Irina Sergeevna", 1, 133000);
    }
    //full array
    public static void getListOfEmployees() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
    //sum
    public static double sum() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }
    //max salary
    public static Employee employeeMaxSalary() {
        Employee employeeMaxSalary = employee[0];
        double maxSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
                employeeMaxSalary = employee[i];
            }
        }
        return employeeMaxSalary;
    }
    //min salary
    public static Employee employeeMinSalary() {
        Employee employeeMinSalary = employee[0];
        double minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                employeeMinSalary = employee[i];
            }
        }
        return employeeMinSalary;
    }
    //salary average
    public static double salaryAverage() {
        int sumEmployees = 0;
        double salaryAverage = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sumEmployees++;
            }
            if (sumEmployees !=0) {
                salaryAverage = Main.sum() / sumEmployees;
            } else {
                System.out.println("Кол-во сотрудников = 0");
            }
        }
        return salaryAverage;
    }
    //employees' full names
    public static void fullNames() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getFullName());
            }
        }
    }
    //increase salary for all
    public static void increaseSalaryForAll() {
        double percent = 5;
        double newSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                newSalary = employee[i].getSalary() + employee[i].getSalary() * percent / 100;
                employee[i].setSalary(newSalary);
            }
        }
    }
    //by department
    //max salary
    public static Employee maxSalaryByDep() {
        Employee employeeMaxSalaryByDep = employee[0];
        int department = 1;
        double maxSalary2 = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department && employee[i].getSalary() > maxSalary2) {
                maxSalary2 = employee[i].getSalary();
                employeeMaxSalaryByDep = employee[i];
            }
        }
        return employeeMaxSalaryByDep;
    }
    //min salary
    public static Employee minSalaryByDep() {
        Employee employeeMinSalaryByDep = employee[0];
        int department = 1;
        double minSalary2 = Integer.MAX_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department && employee[i].getSalary() < minSalary2) {
                minSalary2 = employee[i].getSalary();
                employeeMinSalaryByDep = employee[i];
            }
        }
        return employeeMinSalaryByDep;
    }
    //sum
    public static double sumByDep() {
        int department = 1;
        double sum2 = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                sum2 += employee[i].getSalary();
            }
        }
        return sum2;
    }

    //salary average
    public static double salaryAverageByDep() {
        int department = 1;
        int sumEmployees2 = 0;
        double salaryAverage2 = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                sumEmployees2++;
            }
            if (sumEmployees2 != 0) {
                salaryAverage2 = Main.sumByDep() / sumEmployees2;
            } else {
                System.out.println("Кол-во сотрудников = 0");
            }
        }
        return salaryAverage2;
    }

    //increase salary for department
    public static void increaseSalaryByDep() {
        int department = 1;
        double percent2 = 10;
        double newSalary2 = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                newSalary2 = employee[i].getSalary() + employee[i].getSalary() * percent2 / 100;
                employee[i].setSalary(newSalary2);
            }
        }
    }

    //array department
    public static void getEmpleyeesByDep() {
        int department = 1;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                System.out.println(employee[i].toStringWithoutDepartment());
            }
        }
    }

    //by parameter
    //less than
    public static void lessThanParameter() {
        double givenParameter = 100000;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < givenParameter) {
                System.out.println(employee[i].toStringWithoutDepartment());
            }
        }
    }

    //more than
    public static void moreThanParameter() {
        double givenParameter = 100000;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() > givenParameter) {
                System.out.println(employee[i].toStringWithoutDepartment());
            }
        }
    }
}