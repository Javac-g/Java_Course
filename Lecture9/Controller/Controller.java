package Lecture9.Controller;

import Lecture9.View.ViewHelper;
import Lecture9.model.Client;
import Lecture9.model.Client_pattern;
import Lecture9.model.Order;
import Lecture9.model.Tour;
import Lecture9.model.enums.COUNTRIES;
import Lecture9.model.enums.VACCINATIONS;
import Lecture9.services.ClientService;
import Lecture9.services.TourService;

import java.util.*;

public class Controller {
    private static final TourService tourService = new TourService();
    private static final ClientService clientService = new ClientService(tourService);

    public static void main(String...args){
        while (true){
            ViewHelper.printMenu();
            int i = ViewHelper.readNumber("Menu choose: ");
           if(!executeCommand(i)){
               break;
           }
        }
    }
    private static Set<VACCINATIONS> chooseVaccinations(){
        Set<VACCINATIONS> vaccinations = new HashSet<>();
        ViewHelper.printMSG("Enter exiting vaccinations from list o exit to end");
        for (VACCINATIONS vaccinations1 : VACCINATIONS.values()){
            ViewHelper.printMSG(vaccinations1.name());
        }
        while(true){
            String str = ViewHelper.readString("");
            if (str.equals("exit")){
                break;
            }else{
                vaccinations.add(VACCINATIONS.valueOf(str));
            }
        }
        return vaccinations;
    }
    private static boolean executeCommand(int command){
        boolean ans =
                switch (command){
            case 1 ->{
                clientService.addClient(
                                        ViewHelper.readString("client name"),
                                        ViewHelper.readString("client middle name"),
                                        ViewHelper.readString("client last name"),
                                        ViewHelper.readString("client iban"),
                                        chooseVaccinations()
                );
                yield true;

            }
            case 2 -> {
                ViewHelper.printMSG("Enter from Country: \n" + COUNTRIES.getCountries());
                String from = ViewHelper.readString("Select and type");
                String where = ViewHelper.readString("Select where and type");
                int cost = ViewHelper.readNumber("Enter cost: ");
                Set<VACCINATIONS> vaccine = chooseVaccinations();
                tourService.addTour(from,where,cost,vaccine);
                yield true;
            }
            case 3 ->{
                ViewHelper.printMSG("Available tours: ");
                for(Tour tour: tourService.getTours()){
                    ViewHelper.printMSG(tour.getNumber() + " " + tour.getFrom() + " - " + tour.getWhere());
                }
                ViewHelper.printMSG("Available client: ");
                for (Client_pattern client:clientService.getClients()) {

                    ViewHelper.printMSG(client.getNumber() + ": " + client.getFirstName() + " " + client.getLastName());
                }
                long clientNum = ViewHelper.readNumber(" client number");
                long tourNum = ViewHelper.readNumber(" tour number");
                int days = ViewHelper.readNumber(" tour days amount: ");
                boolean nutrition = ViewHelper.readBoolean("Nutrition");
                boolean excursion = ViewHelper.readBoolean(" Excursions");


                clientService.addTourToClient(tourNum,clientNum,days,nutrition,excursion);
                Client_pattern client = clientService.findByClientNumber(clientNum);
                ViewHelper.printMSG("Client: " + client.getFirstName() + " " + client.getMiddleName()
                + " discount: " + client.getDiscount());

                for (Order order: client.getOrders()){
                    ViewHelper.printMSG("Order: " + order.getOrderNumber() );

                }
                yield true;
            }
            case 4 -> {
                int orderNumber = ViewHelper.readNumber(" client number to delete");
                clientService.dropTourByNumber(orderNumber);

                yield true;
            }
            case 5 -> {
                int clientNumber = ViewHelper.readNumber(" client number to find");
                List<Order> orders = clientService.findTourByClientNumber(clientNumber);
                for(Order order : orders){
                    System.out.println(order);
                }
                yield true;
            }
            case 6 ->false;
            default -> throw new IllegalArgumentException("Unknown command");



        };
        return ans;
    }



}
