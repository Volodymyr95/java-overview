package com.perfectial;

public class SwitchOverview {
    public static void main(String[] args) {
        var result = switch (2) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            default -> {
                yield "some result";
            }
        };
    }
}
