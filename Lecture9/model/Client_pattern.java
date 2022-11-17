package Lecture9.model;

import Lecture9.model.enums.VACCINATIONS;

import java.util.List;
import java.util.Set;

public interface Client_pattern {
    List<Order> getOrders();

    Long getNumber();

    String getFirstName();

    String getMiddleName();

    String getLastName();

    String getIbanNumber();

     Set<VACCINATIONS> getVaccinations();
    int getDiscount();
}
