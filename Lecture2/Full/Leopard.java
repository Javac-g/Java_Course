package Lecture2.Full;

import Lecture2.Parts.Cats;

public class Leopard extends Cats {
    private String dots;

    public Leopard(String color, String name, int age, String dots) {
        super(color, name, age);
        this.dots = dots;
    }

    @Override
    public String getFullCat() {
        String cat = getCatStringValue();
        cat = getAdditionalInfo(cat);
        return cat;
    }

    @Override
    protected String getCatStringValue() {
        return " My name is: " + name +" My age is: " + age + " My skin color is: " + color;
    }

    @Override
    protected String getAdditionalInfo(String result) {
        result = result + " My tail is: " + tail.getType();
        result = result + " My nose smells: " + nose.getSmell();
        result = result + " My Dots: " + dots;
        return result;
    }
}
