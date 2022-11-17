package Lecture9.model;

import Lecture9.model.enums.VACCINATIONS;
import java.util.Set;

public class VipClient extends Client implements Client_pattern{
    private int discount;
    public VipClient(Client_pattern client, int discount) {
        super(client.getNumber(), client.getFirstName(), client.getMiddleName(), client.getLastName(),client.getIbanNumber(),client.getVaccinations());
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
