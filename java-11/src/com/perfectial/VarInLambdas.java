package com.perfectial;

import java.util.List;
import java.util.stream.Collectors;

public class VarInLambdas {

    public static void main(String[] args) {
        List.of(1,2,3,4,5,6).stream()
                .map((var i) -> i +12)
                .collect(Collectors.toList());
    }
}
