package org.example;

import java.util.List;

public interface Price {

    int DEFAULT_ARRAY_SIZE = 25;

    List<Integer> top(int limit);

    void push(int nextInt);

    String getName();
}
