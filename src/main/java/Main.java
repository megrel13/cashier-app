import domain.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CleanWasher cleanWasher = new CleanWasher("Айгуль", 24, 60, 100);

        Employer cashier = new Cashier("Галя", 54, 70, 200);
        Employer cashier1 = new Cashier("Оля", 59, 69, 190);
        Employer cashier2 = new Cashier("Наташа", 54, 75, 210);

        Employer sMMSpecialist = new SMMSpecialist("Костя", 24, 80, 350);
        Employer sMMSpecialist1 = new SMMSpecialist("Петя", 29, 76, 330);
        Employer sMMSpecialist2 = new SMMSpecialist("Вася", 31, 85, 370);

     //  List<Employer> listOfSMMspecialist = new ArrayList<>();
     //  listOfSMMspecialist.add(sMMSpecialist);
     //  listOfSMMspecialist.add(sMMSpecialist1);
     //  listOfSMMspecialist.add(sMMSpecialist2);

     //  listOfSMMspecialist.toArray()
        Employer[] employersArray = new Employer[] {sMMSpecialist, sMMSpecialist1, sMMSpecialist2};
        Arrays.sort(employersArray);
        System.out.println(Arrays.toString(employersArray));

        Employer ceo = new CEO("Илон", 48, 100, 1000000);

        Employer loader = new Loader("Генадий", 42, 60, 150);
        Employer loader1 = new Loader("Ибрагим", 37, 55, 140);
        Employer loader2 = new Loader("Тимур", 25, 80, 170);


        List<Employer> arraySalary = new ArrayList<>();
        arraySalary.add(cashier);
        arraySalary.add(cashier1);
        arraySalary.add(cashier2);
        arraySalary.add(sMMSpecialist);
        arraySalary.add(sMMSpecialist1);
        arraySalary.add(sMMSpecialist2);
        arraySalary.add(loader);
        arraySalary.add(loader1);
        arraySalary.add(loader2);
        arraySalary.add(ceo);

        loader.getSalary();

        sMMSpecialist.printPremium();

        CleanWasher cleanWasher2 = (CleanWasher) cleanWasher.clone();
        System.out.println(cleanWasher2.getAge());

    }

        }

//1. Иерархию сотрудников. Employer от него наследуються CleanWasher, Cashier, SMMSpecialist, CEO и кто-то еще.
// имя, возраст, double power( вовлеченность) , salary. некоторые поля надо сделать final
//  Метод double getSalary()
//  константа increaseCoefficient
//  Метод double getPremium() *премия

// 2. Реализуем Интерфейс Comparable для сотрудников (SMMspecialst) сравнить по силе по зарплате)

// 3. Для Ceo реализуем метод toString()
// 4. Реализуем интерфейс Cloneable для CleanWasher
// 5. Добавить всех сотрудников в arrayList. Вывести их зарплаты. // сделать в Main.


