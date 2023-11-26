package com.example.filterutility.filter;

import java.util.List;

public interface Filter<E> {
    List<E> apply(List<E> collection);
}
