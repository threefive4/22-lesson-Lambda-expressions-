package ua.lviv.lgs2;

public class Human {
    private double weight;
    private double height;
    private int age;


    public Human() {
        this(4, 5.4, 45.4);
    }

    public Human(int age, double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
