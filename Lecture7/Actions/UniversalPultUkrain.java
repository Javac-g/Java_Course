package Lecture7.Actions;

public class UniversalPultUkrain {
    public void turnOnAirCond(){
        AirCond airCond = new AirCond();
        System.out.println("User push AC  power button");
        airCond.startAirCond();

    }
    public void turnOnTv(){
        Tv tv = new Tv();
        System.out.println("Користувач запускае телевізор");
        tv.startTv();

    }

    public void turnOnWifiStove(){
        WifiStove wifiStove = new WifiStove();
        System.out.println("Користувач запускае Вайфай піч");
        wifiStove.startWifiStove();
    }
    public void turnOnSmartFridge(){
        SmartFridge smartFridge = new SmartFridge();
        System.out.println("Користувач запускае розумний холодильник");
        smartFridge.startFridge();

    }
}
