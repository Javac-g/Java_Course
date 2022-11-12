package Lecture9.model;

import Lecture9.model.enums.COUNTRIES;
import Lecture9.model.enums.VACCINATIONS;

import java.util.List;

public class Tour {
    private Long number;
    private COUNTRIES from , where;
    private int cost;
    private boolean nutrition , excursion;
    private byte daysAmount;
    private List<VACCINATIONS> vaccinations;

    public Tour(Long number, COUNTRIES from,
                COUNTRIES where, int cost,
                boolean nutrition, boolean excursion,
                byte daysAmount, List<VACCINATIONS> vaccinations) {
        this.number = number;
        this.from = from;
        this.where = where;
        this.cost = cost;
        this.nutrition = nutrition;
        this.excursion = excursion;
        this.daysAmount = daysAmount;
        this.vaccinations = vaccinations;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public COUNTRIES getFrom() {
        return from;
    }

    public void setFrom(COUNTRIES from) {
        this.from = from;
    }

    public COUNTRIES getWhere() {
        return where;
    }

    public void setWhere(COUNTRIES where) {
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

    public List<VACCINATIONS> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<VACCINATIONS> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public int getComminCost(){
        return -1;
    }

}
