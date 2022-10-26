package Lecture2.Full;

import Lecture2.Parts.Cats;
import Lecture2.Parts.Mane;

public class Lion extends Cats {
    private Mane mane;

    public Lion(Mane mane,String color, String name, int age) {
        super(color,name,age);
        this.mane = mane;
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
        result = result + " My Mane: " + mane ;
        return result;
    }
}
