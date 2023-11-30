package com.example.filterutility.filter;

import com.example.filterutility.domain.Gender;

import java.util.List;

public interface GenderFilter<T> extends PreFilter<T>, ParameterizedFilter<T, Gender> {
    List<T> filter(List<T> items);
}

