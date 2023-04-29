package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer i : sourceList) {
            if (i % 2 == 0) {
                addNumbers(i, set, true);
            } else {
                addNumbers(i, set, false);
            }
        }

        return set;
    }

    private void addNumbers(Integer number, Set<Integer> set, Boolean isEven) {
        set.add(number);

        if (number % 2 != 0) {
            if (isEven) {
                set.add(number);
            } else {
                set.add(2 * number);
            }
        } else {
            addNumbers(number/2, set, true);
        }
    }
}
