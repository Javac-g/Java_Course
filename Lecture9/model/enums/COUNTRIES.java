package Lecture9.model.enums;

import Lecture9.jdbc.DBConnector;

import java.util.ArrayList;
import java.util.List;

public class COUNTRIES {
    private COUNTRIES() {
        countries.addAll(DBConnector.getCountriesNames());
    }

    private static List<String> countries = new ArrayList<>();

    public static List<String> getCountries() {
        return countries;
    }
}
