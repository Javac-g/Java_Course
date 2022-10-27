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
        return super.getCatStringValue();
    }

    @Override
    protected String getAdditionalInfo(String result) {
        result = super.getAdditionalInfo(result) + " My Dots: " + dots;
        return result;
    }
}
