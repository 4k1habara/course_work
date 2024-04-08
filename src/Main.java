public class Main {
    private static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        employee[0] = new Employee("Shishkin Alexandr Petrovich", 1, 120000);
        employee[1] = new Employee("Kireev Vladislav Olegovich", 1, 95000);
        employee[2] = new Employee("Novitskiy Konstantin Pavlovich", 3, 178000);
        employee[3] = new Employee("Aksyomov Svyatoslav Rodionovich", 2, 77000);
        employee[4] = new Employee("Boyko Svetlana Grigoryevna", 3, 110000);
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
    public static double maxSalary() {
        double maxSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
            }
        }
        return maxSalary;
    }
    //min salary
    public static double minSalary() {
        double minSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
            }
        }
        return minSalary;
    }
    //salary average
    public static double salaryAverage() {
        int sumEmployees = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sumEmployees++;
            }
        }
        double salaryAverage = Main.sum() / sumEmployees;
        System.out.println("Среднее значение зарплат = " + salaryAverage);
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
        double percent = 5 / 100;
        double newSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                newSalary = employee[i].getSalary() + employee[i].getSalary() * percent;
                employee[i].setSalary(newSalary);
            }
        }
    }
    //by department
    public static int department() {
        int department = 1;
        return department;
    }
    //max salary
    public static double maxSalaryByDep() {
        int department = Main.department();
        double maxSalary2 = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department && employee[i].getSalary() > maxSalary2) {
                maxSalary2 = employee[i].getSalary();
            }
        }
        return maxSalary2;
    }
    //min salary
    public static double minSalaryByDep() {
        int department = Main.department();
        double minSalary2 = Main.maxSalaryByDep();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department && employee[i].getSalary() < minSalary2) {
                minSalary2 = employee[i].getSalary();
            }
        }
        return minSalary2;
    }
    //sum
    public static double sumByDep() {
        int department = Main.department();
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
        int department = Main.department();
        int sumEmployees2 = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                sumEmployees2++;
            }
        }
        double salaryAverage2 = Main.sumByDep() / sumEmployees2;
        return salaryAverage2;
    }

    //increase salary for department
    public static void increaseSalaryByDep() {
        int department = Main.department();
        double percent2 = 10 / 100;
        double newSalary2 = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                newSalary2 = employee[i].getSalary() + employee[i].getSalary() * percent2;
                employee[i].setSalary(newSalary2);
            }
        }
    }

    //array department
    public static void getEmpleyeesByDep() {
        int department = Main.department();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department) {
                System.out.println(employee[i].toStringWithoutDepartment());
            }
        }
    }

    //by parameter
    public static double setParameter() {
        double givenParameter = 100000;
        return givenParameter;
    }

    //less than
    public static void lessThanParameter() {
        double givenParameter = Main.setParameter();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < givenParameter) {
                System.out.println(employee[i].toStringWithoutDepartment());
            }
        }
    }

    //more than
    public static void moreThanParameter() {
        double givenParameter = Main.setParameter();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() > givenParameter) {
                System.out.println(employee[i].toStringWithoutDepartment());
            }
        }
    }
}