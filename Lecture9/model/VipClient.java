package Lecture9.model;

import Lecture9.model.enums.VACCINATIONS;

import java.util.List;

public class VipClient extends Client{
    private int discount;
    public VipClient(Long number, String firstName, String middleName, String lastName, String ibanNumber, List<VACCINATIONS> vaccinations, int discount) {
        super(number, firstName, middleName, lastName, ibanNumber, vaccinations);
        this.discount = discount;
    }


}
