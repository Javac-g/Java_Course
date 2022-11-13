package Lecture9.Controller;

import Lecture9.View.ViewHelper;
import Lecture9.model.enums.VACCINATIONS;
import Lecture9.services.ClientService;
import Lecture9.services.TourService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Controller {
    private static TourService tourService = new TourService();
    private static ClientService clientService = new ClientService(tourService);

    public static void main(String...args){
        while (true){
            ViewHelper.printMenu();
            int i = ViewHelper.readNumber();
           if(!executeCommand(i)){
               break;
           }
        }
    }
    private Set<VACCINATIONS> chooseVaccinations(){
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
                clientService.addClient(ViewHelper.readNumber("client id"),
                                        ViewHelper.readString("client name"),
                                        ViewHelper.readString("client middle name"),
                                        ViewHelper.readString("client last name"),
                                        ViewHelper.readString("client iban"),
                )
                 true;
            }
            case 2 ->{
                true;
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
