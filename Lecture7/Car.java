package Lecture7;

public class Car {
    protected String type,company ;
    protected int doorCount;
    protected double price;

    public Car(String type, String company, int doorCount, double price) {
        type = type;
        company = company;
        this.doorCount = doorCount;
        this.price = price;
    }

    public void setType(String type) {
        type = type;
    }

    public void setCompany(String company) {
        company = company;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public void setPrice(double price) {
        this.price = price;

    }
    private void startCar(){

        System.out.println("My car type is: " + this.type);
        System.out.println("My car company is: " + this.company);
        System.out.println("My car costs: " + this.price);
        System.out.println("My car has " + this.doorCount + " doors");

    }
}
