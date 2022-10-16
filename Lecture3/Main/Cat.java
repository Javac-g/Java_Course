package Lecture3.Main;

import Lecture3.catparts.*;

public class Cat {
    private String name,color;
    private byte eCount;
    private byte lCount;

    private int age;
    private Ear firstEar,secondEar;
    private Leg leg1,leg2,leg3,leg4;
    private Nose nose;
    private Tail tail;
    private Eye eye1,eye2;



    public Cat( String name, String color,  int age) {

        this.name = name;
        this.color = color;
        this.age = age;

        secondEar = new Ear();
        firstEar = new Ear();

        leg1 = new Leg("Front Left");
        leg2 = new Leg("Back Left");
        leg3 = new Leg("Front Right");
        leg4 = new Leg("Front Right");

        nose = new Nose();

        tail = new Tail("Fluffy");

        eye1 = new Eye();
        eye2 = new Eye();
    }


    public byte geteCount() {
        return eCount;
    }

    public void seteCount(byte eCount) {
        this.eCount = eCount;
    }

    public byte getlCount() {
        return lCount;
    }

    public void setlCount(byte lCount) {
        this.lCount = lCount;
    }

    public String getFullCat(){
        String resultString = getCatStringValue();
        resultString = getCatStringValueAdditional(resultString);
        return resultString;
    }
    private  String getCatStringValue(){
        String resultString = "\nHello i am the method for cat: " + name + "\nand cat age is: " + age;
        resultString = resultString + " \nand my color is " + color;
        return resultString;
    }
    private String getCatStringValueAdditional(String resultString){
        resultString = resultString + "\nTail is : " + tail;
        resultString = resultString + "\nNose is : " + nose;
        resultString = resultString + "\nLap Count is: " + lCount;
        resultString = resultString + "\neArs Count is: " + eCount;
        return resultString;
    }

}
