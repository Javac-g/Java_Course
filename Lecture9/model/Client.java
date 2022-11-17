package Lecture9.model;

import Lecture9.model.enums.VACCINATIONS;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Client implements Client_pattern {
    protected Long number;
    protected String firstName,middleName,lastName;
    protected String ibanNumber;

    protected Set<VACCINATIONS> vaccinations;
    protected List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }
    public int getDiscount(){
        return 1;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Client(Long number, String firstName, String middleName, String lastName, String ibanNumber, Set<VACCINATIONS> vaccinations) {
        this.number = number;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.ibanNumber = ibanNumber;
        this.vaccinations = vaccinations;
    }

    public Long getNumber() {
        return number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIbanNumber() {
        return ibanNumber;
    }

    public Set<VACCINATIONS> getVaccinations() {
        return vaccinations;
    }
}
