package streams.functional_interfaces;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //      new FuncInterface() {
        //          @Override
        //          public void hello(String input) {
        //              System.out.println("Ola");
        //          }
        //      };
        //  }
        Predicate<Integer> predicate = i -> i < 0;

        System.out.println("predicate.test(5) = " + predicate.test(5));
        System.out.println("predicate.test(-2) = " + predicate.test(-2));
        System.out.println("predicate.test(3) = " + predicate.test(3));
        System.out.println("predicate.test(4) = " + predicate.test(4));

        Supplier<String> stringSupplier = () -> "Ola";

        System.out.println("stringSupplier.get() = " + stringSupplier.get());
// ДЗ: Function сделать дома

        Function<Integer, String> convertMoney = j -> String.valueOf(j) + " Рублей";
        System.out.println(convertMoney.apply(10));

// ДЗ: Function сделать дома

        Consumer<Integer> consumer = i -> System.out.println("i =" + i);

        consumer.accept(5);

        FuncInterface funcInterface = s -> System.out.println(s);

        funcInterface.hello("HELLO");

        Integer integer = 5;
        //    Integer integer = null;
        Optional.ofNullable(integer).ifPresent(System.out::println);

        Integer intFromOptional = Optional.ofNullable(integer).orElse(6);

        System.out.println(intFromOptional);

        Optional<Integer> optionalInteger = Optional.ofNullable(integer);

//        System.out.println("optionalInteger.get() = " + optionalInteger.get());


//        User actualUser = Optional.ofNullable(dao.findByName("Vanya"))
//                .orElse(new User("test", "test"));


    }
}



