package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        TreeSet<String> set = new TreeSet<>();
        set.addAll(firstSet);
        set.addAll(secondSet);
        set.addAll(thirdSet);

        Set<String> subset = set
                .stream()
                .filter(elem -> (firstSet.contains(elem) && secondSet.contains(elem) &&
                        !thirdSet.contains(elem)) || (!firstSet.contains(elem) &&
                        !secondSet.contains(elem) && thirdSet.contains(elem)))
                .collect(Collectors.toSet());

        return subset;
    }
}
