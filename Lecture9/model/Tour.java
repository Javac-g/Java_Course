package Lecture9.model;

import Lecture9.model.enums.COUNTRIES;
import Lecture9.model.enums.VACCINATIONS;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tour {
    private Long number;
    private String from , where;
    private int cost;
    private int finalCost;
    private boolean nutrition , excursion;
    private byte daysAmount;
    private Set<VACCINATIONS> vaccinations;

    public Tour(Long number, String from,
                String where, int cost,

                Set<VACCINATIONS> vaccinations) {
        this.number = number;
        this.from = from;
        this.where = where;
        this.cost = cost;

        this.vaccinations = vaccinations;
    }

    public Long getNumber() {
        return number;
    }

    public void setFinalCost(int finalCost) {
        this.finalCost = finalCost;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "number=" + number +
                ", from=" + from +
                ", where=" + where +
                ", cost=" + cost +
                ", finalCost=" + finalCost +
                ", nutrition=" + nutrition +
                ", excursion=" + excursion +
                ", daysAmount=" + daysAmount +
                ", vaccinations=" + vaccinations +
                '}';
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

      public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isNutrition() {
        return nutrition;
    }

    public void setNutrition(boolean nutrition) {
        this.nutrition = nutrition;
    }

    public boolean isExcursion() {
        return excursion;
    }

    public void setExcursion(boolean excursion) {
        this.excursion = excursion;
    }

    public byte getDaysAmount() {
        return daysAmount;
    }

    public void setDaysAmount(byte daysAmount) {
        this.daysAmount = daysAmount;
    }

    public Set<VACCINATIONS> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(Set<VACCINATIONS> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public int getFinalCost(){

        int finalprice = this.cost * this.daysAmount;

        finalprice = nutrition ?  finalprice + 200 : finalprice;

        finalprice = excursion ? finalprice + 150 : finalprice;

        return finalprice;
    }

    public Tour clone(){
        Set<VACCINATIONS> vaccinations1 = new HashSet<>();
        vaccinations1.addAll(vaccinations);
        Tour tour = new Tour(this.number, this.from,
                            this.where, this.cost, vaccinations1);
        return tour;
    }

}
