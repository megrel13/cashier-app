import domain.CEO;
import domain.Employee;


import java.util.ArrayList;
import java.util.List;


public class Employees {
    public static final List<Employee> EMPLOYEES = new ArrayList<>();

    public Employees() {
        CEO gosha = new CEO("Гоша", 25, 98.0, 1000);
        EMPLOYEES.add(gosha);
    }


    public void addEmployee(Employee emp) {
        EMPLOYEES.add(emp);
    }

    public void deleteEmployee(Employee emp) {
        EMPLOYEES.remove(emp);
    }

    public void allEmployeesWhoseSalaryHigher1000() {
        for (Employee emp : EMPLOYEES
        ) {
            if (emp.getSalary() > 1000) {
                System.out.println(emp);
            }
        }
    }

    public void AllEmpoyeesWhoseSalaryLower1000AgeLower30PowerHigher20() {
        for (Employee emp : EMPLOYEES
        ) {
            if ((emp.getSalary() < 1000) && (emp.getAge() < 30) && (emp.getPower() > 20)) {
                System.out.println(emp);
            }
        }
    }

    public void findYoungestEmployees() {
        for (int i = 0; i < EMPLOYEES.size(); i++) {
            if (EMPLOYEES.get(i).getAge() < EMPLOYEES.get(i + 1).getAge()) {
                System.out.println("Самый молодой работник: " + EMPLOYEES.get(i));

            }
        }

    }


}
