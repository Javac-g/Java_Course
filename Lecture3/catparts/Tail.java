package Lecture3.catparts;

public class Tail {
    private String tailType;

    public Tail(String tailType) {
        this.tailType = tailType;
    }

    public void move(){
        System.out.println("Move my " + tailType + " tail");
    }
}
