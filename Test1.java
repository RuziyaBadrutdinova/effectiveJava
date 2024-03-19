package ru.task1;

/**
 * @author RuziyaBadrutdinova
 * @since 17.03.2024
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new MyClass().convertObjects("-",0, 1));
        System.out.println(new MyClass().convertObjects("-",7L));
        System.out.println(new MyClass().convertObjects("/",false, true));
        System.out.println(new MyClass().convertObjects(";","q", "er", "uy", "h g"));
        System.out.println(new MyClass().convertObjects(";","x", "c", "", "k"));
        System.out.println(new MyClass().convertObjects("<>", "adg", "kkj", "5", 8, 4));
        System.out.println(new MyClass().convertObjects("<>", null, "kkj", "5"));
    }

}
