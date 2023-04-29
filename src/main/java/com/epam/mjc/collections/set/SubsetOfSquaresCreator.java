package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> set = new TreeSet<>();
        for (Integer i : sourceList) {
            set.add((int)Math.pow(i, 2));
        }

        NavigableSet<Integer> subset = new TreeSet<>(set);
        return subset.subSet(lowerBound, upperBound+1);
    }
}
