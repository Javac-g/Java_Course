package Lecture7.Actions;

public class UniversalPultUkrain implements Pult {
   @Override
    public void turnOnAirCond(){
        AirCond airCond = new AirCond();
        System.out.println("Користувач запускае кондиціонер");
        airCond.startAirCond();

    }
    @Override
    public void turnOnTv(){
        Tv tv = new Tv();
        System.out.println("Користувач запускае телевізор");
        tv.startTv();

    }
    @Override
    public void turnOnWifiStove(){
        WifiStove wifiStove = new WifiStove();
        System.out.println("Користувач запускае Вайфай піч");
        wifiStove.startWifiStove();
    }
    @Override
    public void turnOnSmartFridge(){
        SmartFridge smartFridge = new SmartFridge();
        System.out.println("Користувач запускае розумний холодильник");
        smartFridge.startFridge();

    }
}
