package calculator;

public class ArgMethod {

//    public static void hello(String name) {
//        System.out.println("Hello, " + name);
//    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", your age is " + age);
    }

    public static void hello() {
        System.out.println("Hello");
    }

//    public static void hello(int age) {
//        System.out.println("Hello, your age is " + age);
//    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name, age);
//          Другой вариант исправления
//        ArgMethod.hello(age);

//        ArgMethod.hello(name);
        ArgMethod.hello();
    }
}
