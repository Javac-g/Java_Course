package Lecture9.services;

import Lecture9.model.Client;
import Lecture9.model.enums.VACCINATIONS;

import java.util.List;

public class ClientService {
    public Client addClient(Long number, String firstName, String middleName,
                            String lastName, String ibanNumber,
                            List<VACCINATIONS> vaccinations){

        return new Client(number,firstName,lastName,middleName,ibanNumber,vaccinations);
    }

}
