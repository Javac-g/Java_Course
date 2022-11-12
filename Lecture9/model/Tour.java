package Lecture9.model;

import java.util.List;

public class Tour {
    private Long number;
    private String from,where;
    private int cost,day;
    private byte daysAmount;
    private List<String> vaccinations;

    public int getComminCost(){
        return -1;
    }

}
