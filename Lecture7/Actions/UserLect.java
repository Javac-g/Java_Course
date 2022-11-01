package Lecture7.Actions;

import java.util.Random;

public class UserLect {

    UniversalPultUkrain universalPultUkrain = new UniversalPultUkrain();

    UniversalPultUSA universalPultUSA = new UniversalPultUSA();

    UniversalPultJapanise universalPultJapanise = new UniversalPultJapanise();
    public int getRandomPult(){
        Random random = new Random();
        return random.nextInt(3);
    }
}
