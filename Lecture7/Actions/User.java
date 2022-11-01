package Lecture7.Actions;

import java.util.Random;

public class User {
    private  Pult pult;
    public Pult getRandomPult(){
        Random random = new Random();
        int i = random.nextInt(3);
        switch (i){
            case 0 :
                return pult = new UniversalPultJapanise();

            case 1:
                return  pult = new UniversalPultUkrain();
            case 2:
                return pult = new UniversalPultUSA();
        }
        return null;


    }
//    public Object getRandomPult(){
//        Random random = new Random();
//        int i = random.nextInt(3);
//        switch (i){
//            case 0 :
//                return universalPultJapanise;
//
//            case 1:
//                return  universalPultUkrain;
//            case 2:
//                return universalPultUSA;
//        }
//        return null;
//    }
}
