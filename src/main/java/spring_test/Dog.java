package spring_test;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
