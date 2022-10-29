package Lecture7;

public class Factory {
    public GermanCar getGermanCar(){
        GermanCar germanCar = new GermanCar();
        germanCar.setCompany("Toyota");
        germanCar.setDoorCount(2);
        germanCar.setEngine(new V8());
        germanCar.setPrice(9000);
        germanCar.setRudder("left");
        germanCar.setType("Jeep");
        return germanCar;

    }
    public JapanCar getJapanCar(){
        JapanCar japanCar = new JapanCar();
        japanCar.setCompany("Toyota");
        japanCar.setDoorCount(4);
        japanCar.setEngine(new V12());
        japanCar.setPrice(12000);
        japanCar.setRudder("right");
        japanCar.setType("Hatchback");
        return japanCar;

    }
}
