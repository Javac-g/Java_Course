package Lecture2.Full;

import Lecture2.Parts.Ear;
import Lecture2.Parts.Eye;
import Lecture2.Parts.Leg;
import Lecture2.Parts.Nose;
import Lecture2.Parts.Tail;

public class Cat {
    protected String color,name;
    protected int age;

    protected Leg leg1,leg2,leg3,leg4;
    protected Eye eye1,eye2;
    protected Ear ear1,ear2;
    protected Nose nose;
    protected Tail tail;

    public Cat(String color, String name, int age) {

        this.color = color;
        this.name = name;
        this.age = age;
        //Legs
        leg1 = new Leg("Front left");
        leg2 = new Leg("Front right");
        leg3 = new Leg("Back left");
        leg4 = new Leg("Back right");
        //Ears
        ear1 = new Ear("Wind");
        ear2 = new Ear("Wheels");
        //Eyes
        eye1 = new Eye("Road");
        eye2 = new Eye("Dog");
        //Nose
        nose = new Nose("some food");
        tail = new Tail("Fluffy");
    }
    public String getFullCat(){
        String cat = getCatStringValue();
        cat = getAdditionalInfo(cat);
        return cat;
    }
    private String getCatStringValue(){
        String result = "My name is: " + name +"\nMy age is: " + age + "\nMy skin color is: " + color;
        return result;
    }
    private String getAdditionalInfo(String result){

        result = result + "\nMy tail is: " + tail.getType();
        result = result + "\nMy nose smells: " + nose.getSmell();
        return result;
    }
}
