package com.example.filterutility.filter;

import com.example.filterutility.domain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreFilterFactory {
    public static List<GenderFilter<Person>> createGenderFilters(String[] args) {
        List<GenderFilter<Person>> genderFilters = new ArrayList<>();

        GenderFilterFactory<Person> filterFactory = new GenderFilterFactory<>();

        if (containsArgument(args, "--males-only")) {
            genderFilters.add(filterFactory.createFilter("males"));
        }

        if (containsArgument(args, "--females-only")) {
            genderFilters.add(filterFactory.createFilter("females"));
        }

        return genderFilters;
    }

    private static boolean containsArgument(String[] args, String argName) {
        return Arrays.asList(args).contains(argName);
    }
}
