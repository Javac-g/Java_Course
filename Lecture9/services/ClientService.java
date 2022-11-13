package Lecture9.services;

import Lecture9.model.Client;
import Lecture9.model.Order;
import Lecture9.model.enums.VACCINATIONS;

import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private TourService tourService = new TourService();
    private static int orderCounter = 0;
    private static final List<Client> clients = new ArrayList<>();
    public Client addClient(Long number, String firstName, String middleName,
                            String lastName, String ibanNumber,
                            List<VACCINATIONS> vaccinations){

        Client client = new Client(number,firstName,lastName,middleName,ibanNumber,vaccinations);
        clients.add(client);
        return client;
    }
    private Client findByClientNumber(Long number){
        for(Client client: clients){
            if (client.getNumber().equals(number)){
                return client;
            }
        }
        return null;
    }
    public boolean addTourToClient(Long tourNumber,Long clientNumber) {
        Order order = new Order(tourService.findTourByNumber(tourNumber));

        Client client = findByClientNumber(clientNumber);
        if (client != null){
            client.getOrders().add(order);
            order.setOrderNumber(orderCounter);
            orderCounter++;

            return true;
        }else{
            return false;
        }


    }
    public boolean dropNumber(long orderNum){
        int index = -1;
        for(Client client:clients){

            for(int i = 0; i <  client.getOrders().size();i++){
                if (client.getOrders().get(i).getOrderNumber()  == orderNum){
                    index = i;
                    break;
                }
            }if (index != -1){
                client.getOrders().remove(index);
                return true;
            }
        }
        return false;
    }



}
