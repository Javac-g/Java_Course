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

    }

    @Override
    protected String getCatStringValue() {
        return super.getCatStringValue();
    }

    @Override
    protected String getAdditionalInfo(String result) {
        return super.getAdditionalInfo(result);
    }
}
