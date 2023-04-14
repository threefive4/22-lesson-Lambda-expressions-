package ua.lviv.lgs3;

public class Main {
    public static void main(String[] args) {

        Frog f = new Frog();
        AmphibianInfo info = (amphibian) -> {
            amphibian.eat();
            amphibian.sleep();
            amphibian.swim();
            amphibian.walk();
        };
        info.getInfo(f);

    }
}
