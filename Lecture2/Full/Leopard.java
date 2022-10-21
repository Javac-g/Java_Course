package Lecture2.Full;

import Lecture2.Parts.Cats;

public class Leopard extends Cats {
    private String dots;

    public Leopard(String color, String name, int age, String dots) {
        super(color, name, age);
        this.dots = dots;
    }
}
