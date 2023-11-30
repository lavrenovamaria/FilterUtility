package com.example.filterutility.filter;

public class GenderFilterFactory<T> {
    public GenderFilter<T> createFilter(String genderType) {
        return switch (genderType.toLowerCase()) {
            case "males" -> new MenFilter<>();
            case "females" -> new WomenFilter<>();
            default -> throw new IllegalArgumentException("Unknown gender type: " + genderType);
        };
    }
}
