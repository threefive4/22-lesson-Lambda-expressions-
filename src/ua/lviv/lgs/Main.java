package ua.lviv.lgs;

public class Main {
    public static void main(String[] args) {

        Pet dog = () -> System.out.println("Я пес - Гаууу-Гаууу");
        dog.voice();
        Pet cat = () -> System.out.println("Я кіт- Мяууу-Мяууу");
        cat.voice();
        Pet cow = () -> System.out.println("Я корова- Мууу-Мууу");
        cow.voice();

    }
}
@FunctionalInterface
interface Pet {
    void voice();
}
