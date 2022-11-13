package Lecture9.Controller;

import Lecture9.services.ClientService;
import Lecture9.services.TourService;

public class Controller {
    private TourService tourService = new TourService();
    private ClientService clientService = new ClientService(tourService);





}
