package Lecture9.services;

import Lecture9.model.Tour;
import Lecture9.model.enums.COUNTRIES;
import Lecture9.model.enums.VACCINATIONS;

import java.util.ArrayList;
import java.util.List;

public class TourService {
    private static  final List<Tour> tours = new ArrayList<>();
    public Tour addTour(Long number, COUNTRIES from,
                        COUNTRIES where, int cost,
                        boolean nutrition, boolean excursion,
                        byte daysAmount, List<VACCINATIONS> vaccinations){
        Tour tour = new Tour(number,from,where,cost
                ,nutrition,excursion,daysAmount,vaccinations);
        tours.add(tour);
        return tour;

    }

}
