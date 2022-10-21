package Lecture2.Full;

import Lecture2.Parts.Cats;

public class Lion extends Cats {
    private String mane;

    public Lion(String mane,String color, String name, int age) {
        super(name,color,age);
        this.mane = mane;
    }
}
