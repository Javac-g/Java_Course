package Lecture7;

public class JapanCar extends Car{
    @Override
    public void userGuide(){

        System.out.println("User car type is: " + this.type);
        System.out.println("User car company is: " + this.company);
        System.out.println("User car has: " + this.doorCount + " doors");
        System.out.println("User should sit from the left  side of car");
        System.out.println("User car costs: " + this.price);
        System.out.println("User car has " + this.engine.getType() + " engine");


    }
}
