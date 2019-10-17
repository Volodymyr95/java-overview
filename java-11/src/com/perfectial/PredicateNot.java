package com.perfectial;

import java.util.function.Predicate;

public class PredicateNot {
    public static void main(String[] args) {
        "one\n     \ntwo".lines().filter(Predicate.not(String::isBlank)).forEach(s -> System.out.println(s));
    }
}
