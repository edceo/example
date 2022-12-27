package org.example;

// immutable class

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class PriceObj implements Price {
    private final String name;
    private final List<Integer> list;

    public PriceObj(String name) {
        this.name = name;
        this.list = new ArrayList<>(DEFAULT_ARRAY_SIZE);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Integer> top(int limit) {
        return list.stream().sorted(Comparator.reverseOrder()).limit(limit).collect(Collectors.toList());
    }

    @Override
    public void push(int nextInt) {
        list.add(nextInt);
    }

}
