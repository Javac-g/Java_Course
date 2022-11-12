package Lecture9.services;

import Lecture9.model.Client;
import Lecture9.model.enums.VACCINATIONS;

import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private static final List<Client> clients = new ArrayList<>();
    public Client addClient(Long number, String firstName, String middleName,
                            String lastName, String ibanNumber,
                            List<VACCINATIONS> vaccinations){

        Client client = new Client(number,firstName,lastName,middleName,ibanNumber,vaccinations);
        clients.add(client);
        return client;
    }



}
