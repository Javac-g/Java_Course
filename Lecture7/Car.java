package Lecture7;

public class Car {
    protected String type,company ;
    protected int doorCount,price;

    protected Engine engine;
    protected String rudder;


    //Variables aria end
    public Car() {


    }

    //Constructors area end
    public void setType(String type) {
        type = type;
    }

    public void setCompany(String company) {
        company = company;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public void setPrice(int price) {
        this.price = price;

    }

    public void setRudder(String rudder) {
        this.rudder = rudder;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }
    //Getter,Setter area end
    private void startCar(){

        System.out.println("My car type is: " + this.type);
        System.out.println("My car company is: " + this.company);
        System.out.println("My car costs: " + this.price);
        System.out.println("My car has " + this.doorCount + " doors");


    }

    //Methods Area end
}
