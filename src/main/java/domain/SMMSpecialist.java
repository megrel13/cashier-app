package domain;


public class SMMSpecialist extends Employer implements Comparable<SMMSpecialist> {
    public SMMSpecialist(String name, int age, double power, double salary) {
        super(name, age, power, salary);
    }


    @Override
    public int compareTo(SMMSpecialist o) {
            return (int) (this.getPower() - o.getPower());

    }

}