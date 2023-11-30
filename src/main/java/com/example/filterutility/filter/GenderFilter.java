package com.example.filterutility.filter;

import com.example.filterutility.domain.Gender;
import com.example.filterutility.domain.Person;

import java.util.List;
import java.util.stream.Collectors;

public class GenderFilter extends ParameterizedFilter<Person, Boolean> {
    private final Gender gender;

    public GenderFilter(Gender gender, boolean apply) {
        super(apply);
        this.gender = gender;
    }

    @Override
    public List<Person> apply(List<Person> collection) {
        if (!value) {
            return collection;
        } else {
            return collection.stream().filter(person -> person.getGender().equals(gender)).collect(Collectors.toList());
        }
    }
}
