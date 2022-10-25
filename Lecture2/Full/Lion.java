package Lecture2.Full;

import Lecture2.Parts.Cats;
import Lecture2.Parts.Mane;

public class Lion extends Cats {
    private Mane mane;

    public Lion(Mane mane,String color, String name, int age) {
        super(name,color,age);
        this.mane = mane;
    }
}
