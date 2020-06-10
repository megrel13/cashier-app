import domain.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        CleanWasher cleanWasher = new CleanWasher("Айгуль", 24, 60, 100);

        Employee cashier = new Cashier("Галя", 54, 70, 200);
        Employee cashier1 = new Cashier("Оля", 59, 69, 190);
        Employee cashier2 = new Cashier("Наташа", 54, 75, 210);

        Employee sMMSpecialist = new SMMSpecialist("Костя", 24, 80, 350);
        Employee sMMSpecialist1 = new SMMSpecialist("Петя", 29, 76, 330);
        Employee sMMSpecialist2 = new SMMSpecialist("Вася", 31, 85, 370);

        //  List<Employer> listOfSMMspecialist = new ArrayList<>();
        //  listOfSMMspecialist.add(sMMSpecialist);
        //  listOfSMMspecialist.add(sMMSpecialist1);
        //  listOfSMMspecialist.add(sMMSpecialist2);

        //  listOfSMMspecialist.toArray()
        Employee[] employersArray = new Employee[]{sMMSpecialist, sMMSpecialist1, sMMSpecialist2};
        Arrays.sort(employersArray);
        System.out.println(Arrays.toString(employersArray));

        Employee ceo = new CEO("Илон", 48, 100, 1000000);

        Employee loader = new Loader("Генадий", 42, 60, 150);
        Employee loader1 = new Loader("Ибрагим", 37, 55, 140);
        Employee loader2 = new Loader("Тимур", 25, 80, 170);


        List<Employee> arraySalary = new ArrayList<>();
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


     //  String ceoCount = null;
     //  String cleanWasherCount = null;
     //  String cashierCount = null;

     //  try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
     //      System.out.println("Введите количество Сeo");
     //      ceoCount = console.readLine();

     //      System.out.println("Введите количество CleanWasher");

     //      cleanWasherCount = console.readLine();

     //      System.out.println("Введитье количество Cashier");

     //      cashierCount = console.readLine();


     //  } catch (IOException e) {
     //      e.printStackTrace();
     //  }
     //  System.out.println("Количество CEO: " + ceoCount);
     //  System.out.println("Количество уборщиц: " + cleanWasherCount);
     //  System.out.println("Количество кассиров: " + cashierCount);


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


