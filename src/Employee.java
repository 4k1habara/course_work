import java.util.Objects;

public class Employee {
    private String fullName;
    private int department, ID;
    private double salary;
    private static int counter = 0;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        ID = counter;
        counter++;
    }
    public int getCounter() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return fullName +
                ": отдел(" + department +
                ") З/П(" + salary +
                ") ID(" + ID + ")";
    }
    public String toString2() {
        return fullName +
                ": З/П(" + salary +
                ") ID(" + ID + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return department == employee.department && salary == employee.salary && ID == employee.ID && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, ID);
    }
}
