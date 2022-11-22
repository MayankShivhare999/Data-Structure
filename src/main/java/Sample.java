import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sample {
    String fun1() {
        return new Sample().fun2("Java");
    }

    String fun2(String s) {
        return "is awsome";
    }
    public static void main(String[] args) {


        System.out.println(new Sample().fun1());
    }
}
