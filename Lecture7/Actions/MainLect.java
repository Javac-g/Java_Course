package Lecture7.Actions;

public class MainLect {
    public static void main(String...args){
        UserLect user =  new UserLect();
        int n = user.getRandomPult();

        if(n == 0){
            UniversalPultJapanise japanise = new UniversalPultJapanise();
            japanise.turnOnAirCond();
            japanise.turnOnSmartFridge();
            japanise.turnOnWifiStove();
            japanise.turnOnTv();
        }else if(n == 1){
            UniversalPultUkrain ukrain = new UniversalPultUkrain();
            ukrain.turnOnAirCond();
            ukrain.turnOnSmartFridge();
            ukrain.turnOnWifiStove();
            ukrain.turnOnTv();

        } else if (n == 2) {
            UniversalPultUSA usa = new UniversalPultUSA();
            usa.turnOnAirCond();
            usa.turnOnSmartFridge();
            usa.turnOnWifiStove();
            usaturnOnTv();

        }

    }
}
