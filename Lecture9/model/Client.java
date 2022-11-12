package Lecture9.model;

import Lecture9.model.enums.VACCINATIONS;

import java.util.List;

public class Client {
    protected Long number;
    protected String firstName,middleName,lastName;
    protected String ibanNumber;
    protected List<VACCINATIONS> vaccinations;

    public Client(Long number, String firstName, String middleName, String lastName, String ibanNumber, List<VACCINATIONS> vaccinations) {
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

    public List<VACCINATIONS> getVaccinations() {
        return vaccinations;
    }
}
