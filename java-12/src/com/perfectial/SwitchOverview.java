package com.perfectial;

public class SwitchOverview {
    public static void main(String[] args) {
        var day = 2;
        var result = switch (day) {
            case 1, 3 -> "Sunday";
            case 2 -> "Monday";
            default -> "Some day";
        };

        System.out.println(result);
    }
}
