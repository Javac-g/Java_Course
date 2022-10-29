package Lecture7;

public abstract class Car  {
    protected String type,company ;
    protected int doorCount,price;

    protected Engine engine;
    protected String rudder;


    //Variables aria end
    public Car() {


    }

    //Constructors area end
    public void setType(String type) {
        this.type = type;
    }

    public void setCompany(String company) {
        this.company = company;
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
    protected abstract void userGuide();

    //Methods Area end
}
