package Lecture2.Full;

import Lecture2.Parts.Cats;

public class Main {
    public static void One(Cats cat){
        System.out.println(cat);
    }
    public static void main(String...args){
        Cat Vasya = new Cat("White","Vasya",2);
        System.out.println(Vasya.getFullCat());
        One(Vasya);

    }
}
