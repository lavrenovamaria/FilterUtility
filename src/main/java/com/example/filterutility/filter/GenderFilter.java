package com.example.filterutility.filter;

import java.util.List;

public interface GenderFilter<T> extends PreFilter<T> {
    List<T> filter(List<T> items);
}