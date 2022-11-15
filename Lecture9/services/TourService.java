package Lecture9.services;

import Lecture9.model.Tour;
import Lecture9.model.enums.COUNTRIES;
import Lecture9.model.enums.VACCINATIONS;

import java.util.ArrayList;
import java.util.List;

public class TourService {
    private static  final List<Tour> tours = new ArrayList<>();
    private long tourNamber = 0;


    public Tour findTourByNumber(Long number){
        for (Tour tour:tours ){
            if (tour.getNumber().equals(number)){
                return tour;
            }
        }
        return null;
    }
    public Tour addTour( COUNTRIES from,
                        COUNTRIES where,
                         int cost,
                        boolean nutrition,
                         boolean excursion,
                        byte daysAmount,
                         List<VACCINATIONS> vaccinations){

        Tour tour = new Tour(tourNamber,
                            from,
                            where,
                            cost,
                            nutrition,
                            excursion,
                            daysAmount,
                            vaccinations);

        tours.add(tour);
        tourNamber++;
        return tour;

    }

}
