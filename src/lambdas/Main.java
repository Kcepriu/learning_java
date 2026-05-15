package lambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        greet(System.out::println);

        ArrayList<String> myList = new ArrayList<>(List.of("a", "b", "c"));
        myList.forEach(System.out::println);


    }



    public static void greet (Printer printer) {
        printer.print("Hello world");
    }

}
