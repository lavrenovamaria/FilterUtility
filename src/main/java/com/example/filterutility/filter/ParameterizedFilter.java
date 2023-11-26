package com.example.filterutility.filter;

abstract class ParameterizedFilter<E, V> implements Filter<E> {
    protected V value;

    public ParameterizedFilter(V value) {
        this.value = value;
    }
}
