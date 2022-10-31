package Lecture7.Actions;

import java.util.Random;

public class User {
    UniversalPultUkrain universalPultUkrain = new UniversalPultUkrain();
    UniversalPultUSA universalPultUSA = new UniversalPultUSA();
    UniversalPultJapanise universalPultJapanise = new UniversalPultJapanise();

    public Object getRandomPult(){
        Random random = new Random();
        int i = random.nextInt(3);
        switch (i){
            case 0 :
                return universalPultJapanise;

            case 1:
                return  universalPultUkrain;
            case 2:
                return universalPultUSA;
        }
        return null;
    }
}
