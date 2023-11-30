package com.example.filterutility.filter;

import java.util.List;

public class MenFilter<T> implements GenderFilter<T> {
    @Override
    public List<T> filter(List<T> items) {

        return items;
    }
}
