package Lecture2.Parts;
public class Leg {
    private String type;
    public Leg(String type){
        this.type = type;
    }
    public void move(){
        System.out.println("Moved " + type + "leg");
    }

}
