package Lecture9.Controller;

import Lecture9.View.ViewHelper;
import Lecture9.model.enums.COUNTRIES;
import Lecture9.model.enums.VACCINATIONS;
import Lecture9.services.ClientService;
import Lecture9.services.TourService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
                ViewHelper.printMSG("Enter from Country: " + COUNTRIES.values());
                COUNTRIES from = COUNTRIES.valueOf(ViewHelper.readString("Select and type"));
                COUNTRIES where = COUNTRIES.valueOf(ViewHelper.readString("Select where and type"));
                int cost = ViewHelper.readNumber("Enter cost: ");
                Set<VACCINATIONS> vaccine = chooseVaccinations();
                tourService.addTour(from,where,cost,vaccine);
                yield true;
            }
            case 3 ->{
            yield true;
                    }
            case 4 -> false;
            default -> throw new IllegalArgumentException();
        };
        return ans;
    }



}
