package Lecture2.Parts;

public class Tail {
    private String type;

    public Tail(String type) {
        this.type = type;
    }
    public void move(){
        System.out.println("I moving my " +  type + " tail");
    }

    public String getType() {
        return type;
    }
}
