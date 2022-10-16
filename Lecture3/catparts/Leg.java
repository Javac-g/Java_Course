package Lecture3.catparts;

public class Leg {
    private String type;

    public Leg(String type) {
        this.type = type;
    }

    public void move(){
        System.out.println("Move : " + type + " leg");
    }

    public String getType() {
        return type;
    }


}
