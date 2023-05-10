package org.example.service;

import org.example.sort.StringSort;

import java.util.List;

public class SortService {
    private StringSort stringSort;

    public void sortStrings(List<String> strings){
        stringSort.sortStrings(strings);
    }

    public SortService() {
    }

    public SortService(StringSort stringSort) {
        this.stringSort = stringSort;
    }

    public StringSort getStringSort() {
        return stringSort;
    }

    public void setStringSort(StringSort stringSort) {
        this.stringSort = stringSort;
    }
}
