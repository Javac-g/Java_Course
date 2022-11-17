package Lecture9.services;

import Lecture9.model.*;
import Lecture9.model.enums.VACCINATIONS;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ClientService {
    private TourService tourService = new TourService();
    private static int orderCounter = 0;
    private static long clientCounter = 0;
    private static final List<Client_pattern> clients = new ArrayList<>();

    public ClientService(TourService tourService) {
        this.tourService = tourService;
    }
    public List<Client_pattern> getClients(){
        return clients;
    }

    public Client addClient(String firstName, String middleName,
                            String lastName, String ibanNumber,
                            Set<VACCINATIONS> vaccinations){

        Client client = new Client(clientCounter,firstName,lastName,middleName,ibanNumber,vaccinations);
        clients.add(client);
        clientCounter++;
        return client;
    }
    public Client_pattern findByClientNumber(Long number){
        for(Client_pattern client: clients){
            if (client.getNumber().equals(number)){
                return client;
            }
        }
        return null;
    }
    private Client_pattern makeVip(Client_pattern client){
        int number = -1;
        for (int i = 0; i < clients.size(); i++){
            if (client.getNumber() == clients.get(i).getNumber()){
                number = i;
                break;
            }
        }
        Client_pattern vipClient = new VipClient(clients.get(number),100);
        if(number != -1){
            clients.set(number, vipClient);
        }
        return vipClient;
    }
    public boolean addTourToClient(Long tourNumber,Long clientNumber,int daysCount,boolean nutrition,boolean excursion) {
        Client_pattern client = findByClientNumber(clientNumber);

        Tour tour = tourService.findTourByNumber(tourNumber);
        if(!client.getVaccinations().containsAll(tour.getVaccinations())){
            return false;
        };
        if (client.getOrders().size() == 3 ){
           client = makeVip(client);
        }
        Tour tourClone = tour.clone();
        tourClone.setDaysAmount((byte)daysCount);
        tourClone.setNutrition(nutrition);
        tourClone.setExcursion(excursion);
        tourClone.setFinalCost(tourClone.getFinalCost() - client.getDiscount());
        Order order = new Order(tourClone);


        if (client != null){
            client.getOrders().add(order);
            order.setOrderNumber(orderCounter);
            orderCounter++;

            return true;
        }else{
            return false;
        }


    }
    public boolean dropTourByNumber(long orderNum){
        int index = -1;
        for(Client_pattern client:clients){

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
