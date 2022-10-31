package Lecture7.Actions;

public class UniversalPultChinise {

    public void turnOnAirCond(){
        AirCond airCond = new AirCond();
        System.out.println("User push AC  power button");
        airCond.startAirCond();

    }
    public void turnOnTv(){
        Tv tv = new Tv();
        System.out.println("User push TV  power button");
        tv.startTv();

    }

    public void turnOnWifiStove(){
        WifiStove wifiStove = new WifiStove();
        System.out.println("User push Wifi Stove  power button");
        wifiStove.startWifiStove();
    }
    public void turnOnSmartFridge(){
        SmartFridge smartFridge = new SmartFridge();
        System.out.println("User push Smart Fridge  power button");
        smartFridge.startFridge();

    }
}
