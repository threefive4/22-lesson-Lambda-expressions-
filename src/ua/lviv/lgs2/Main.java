package ua.lviv.lgs2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        MyInterface myInterface = (human1) -> System.out.println(human1.toString());
        myInterface.getInfo(human);

    }
}
