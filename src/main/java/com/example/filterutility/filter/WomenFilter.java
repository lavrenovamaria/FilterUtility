package com.example.filterutility.filter;

import java.util.List;

public class WomenFilter<T> implements GenderFilter<T> {
    @Override
    public List<T> filter(List<T> items) {

        return items;
    }

    @Override
    public List<T> apply(List<T> collection) {
        return null;
    }
}