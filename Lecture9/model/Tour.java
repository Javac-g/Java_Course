package Lecture9.model;

import Lecture9.model.enums.COUNTRIES;
import Lecture9.model.enums.VACCINATIONS;

import java.util.List;

public class Tour {
    private Long number;
    private COUNTRIES from,where;
    private int cost;
    private boolean nutrition,excursion;
    private byte daysAmount;
    private List<VACCINATIONS> vaccinations;

    public int getComminCost(){
        return -1;
    }

}
