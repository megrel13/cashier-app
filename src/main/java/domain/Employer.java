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
    public final static int INCREASE_COEFFICENT = 2;


    public void printSalary() {
        System.out.println(salary);
    }

    public void printPremium() {
        System.out.println(salary * INCREASE_COEFFICENT);
    }

}

