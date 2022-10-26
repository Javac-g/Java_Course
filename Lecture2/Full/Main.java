package Lecture2.Full;

import Lecture2.Parts.Cats;
import Lecture2.Parts.Mane;

public class Main {
    public static void One(Cats cat){
        System.out.println(cat);
    }
    public static void main(String...args){
        Cat Vasya = new Cat("White","Vasya",2);
        Lion lion = new Lion(new Mane(),"White","Boris",5);
        Leopard leopard = new  Leopard("White","Stepan",7,"Black");

        System.out.println(Vasya.getFullCat());
        System.out.println(lion.getFullCat());
        System.out.println(leopard.getFullCat());
        One(Vasya);

    }
}
