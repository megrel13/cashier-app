package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Employer {
    private final String name;
    private int age;
    private final double power;
    private double salary;
    private static int increaseCoefficient;


    public void printSalary() {
        System.out.println(salary);
    }

    public void printPremium() {
        System.out.println(salary * increaseCoefficient);
    }

}

