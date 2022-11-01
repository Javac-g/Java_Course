package Lecture7.Actions;

public class MainLect {
    private static void usePult(UniversalPultUSA usa,UniversalPultUkrain ukrain, UniversalPultJapanise japanise){
        if(japanise != null){
            japanise.turnOnAirCond();
            japanise.turnOnSmartFridge();
            japanise.turnOnWifiStove();
            japanise.turnOnTv();

        }else if(ukrain != null){
            ukrain.turnOnAirCond();
            ukrain.turnOnSmartFridge();
            ukrain.turnOnWifiStove();
            ukrain.turnOnTv();

        }else if(usa != null){
            usa.turnOnAirCond();
            usa.turnOnSmartFridge();
            usa.turnOnWifiStove();
            usa.turnOnTv();

        }

    }
    public static void main(String...args){
        UserLect user =  new UserLect();
        int n = user.getRandomPult();
        UniversalPultJapanise japanise = null;
        UniversalPultUkrain ukrain = null;
        UniversalPultUSA usa = null;

        if(n == 0){
            japanise = user.getUniversalPultJapanise();

        }else if(n == 1){
            ukrain = user.getUniversalPultUkrain();


        } else if (n == 2) {
            usa = user.getUniversalPultUSA();


        }
        usePult(usa,ukrain,japanise);

    }
}
