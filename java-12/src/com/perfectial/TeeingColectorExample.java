package com.perfectial;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingColectorExample {


    public static void main(String[] args) {
//        var result =
//                Stream.of("Devoxx", "Voxxed Days", "Code One", "Basel One",
//                        "Angular Connect")
//                        .collect(Collectors.teeing(
//
//                                Collectors.filtering(n -> n.contains("xx"), Collectors.toList()),
//
//                                Collectors.filtering(n -> n.endsWith("One"), Collectors.toList()),
//
//                                (List<String> list1, List<String> list2) -> List.of(list1, list2)
//                        ));
//        System.out.println(result);


//        var result =
//                Stream.of(5, 12, 19, 21)
//                        .collect(Collectors.teeing(
//                                Collectors.counting(),
//                                Collectors.summingInt(n -> Integer.valueOf(n.toString())),
//                                Result::new
//                        ));
//        System.out.println(result);
    }

    static class Result {
        private Long count;
        private Integer sum;

        public Result(Long count, Integer sum) {
            this.count = count;
            this.sum = sum;
        }

        @Override
        public String toString() {
            return "{" +
                    "count=" + count +
                    ", sum=" + sum +
                    '}';
        }
    }

}
