package Lecture9.services;

import Lecture9.model.Tour;
import Lecture9.model.enums.COUNTRIES;
import Lecture9.model.enums.VACCINATIONS;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
                         Set<VACCINATIONS> vaccinations){

        Tour tour = new Tour(tourNamber,
                            from,
                            where,
                            cost,
                            vaccinations);

        tours.add(tour);
        tourNamber++;
        return tour;

    }

}
