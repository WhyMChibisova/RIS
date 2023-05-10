package org.example.sort;

import java.util.Collections;
import java.util.List;

public class StringSortImpl implements StringSort {
    public void sortStrings(List<String> strings) {
        Collections.sort(strings);
    }

    public StringSortImpl() {
    }
}
