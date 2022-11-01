package Lecture7.Actions;

public class Main {

    public static void launch(Pult p){
        p.turnOnTv();
        p.turnOnAirCond();
        p.turnOnSmartFridge();
        p.turnOnWifiStove();
    }
    public static void main(String...args){


        User user = new User();
        Pult pult = user.getRandomPult();


        launch(pult);

//        Object ob = user.getRandomPult();

//
//        if(ob.getClass().getName().equals("Lecture7.Actions.UniversalPultUSA")){
//            UniversalPultUSA usa = (UniversalPultUSA) ob;
//            usa.turnOnAirCond();
//        }else if (ob.getClass().getName().equals("Lecture7.Actions.UniversalPultJapanise")) {
//            UniversalPultJapanise japanise = (UniversalPultJapanise) ob;
//            japanise.turnOnAirCond();
//        }else if (ob.getClass().getName().equals("Lecture7.Actions.UniversalPultUkrain")) {
//            UniversalPultUkrain ukraine = (UniversalPultUkrain) ob;
//            ukraine.turnOnAirCond();
//        }
    }
}
