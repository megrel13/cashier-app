package domain;

public class CleanWasher extends Employer implements Cloneable, Comparable<CleanWasher> {

    public CleanWasher(String name, int age, double power, double salary) {
        super(name, age, power, salary);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(CleanWasher o) {
        return (int) (this.getSalary()-o.getSalary());
    }

    @Override
    public String toString() {
        return "Мы лучшие уборщицы на свете!)";
    }
}
