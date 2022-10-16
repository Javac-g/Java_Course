package Lecture3.Main;

public class Main {
    public static void main(String...args){
        String str = "a";
        int number = 10;
        Cat first = new Cat("Vasya","White",1);
        first.seteCount((byte) 4);
        first.setlCount((byte)4);


        String result = first.getFullCat();

        System.out.println(result);
    }
}
