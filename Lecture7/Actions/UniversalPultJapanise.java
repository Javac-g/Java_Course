package Lecture7.Actions;

public class UniversalPultJapanise {

    public void turnOnAirCond(){
        AirCond airCond = new AirCond();
        System.out.println("くぇ　ムシシ");
        airCond.startAirCond();

    }
    public void turnOnTv(){
        Tv tv = new Tv();
        System.out.println("手ぇ");
        tv.startTv();

    }

    public void turnOnWifiStove(){
        WifiStove wifiStove = new WifiStove();
        System.out.println("子供");
        wifiStove.startWifiStove();
    }
    public void turnOnSmartFridge(){
        SmartFridge smartFridge = new SmartFridge();
        System.out.println("オジサ");
        smartFridge.startFridge();

    }
}
