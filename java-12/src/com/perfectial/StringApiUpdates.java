package com.perfectial;

import java.util.Optional;

public class StringApiUpdates {

    public static void main(String[] args) {
        var template = "Hi, Hello";

//        System.out.println(template.indent(1));
//        System.out.println(template.indent(2));
//        System.out.println(template.indent(3));
//        System.out.println(template.indent(4));


//        char[] transform = template.transform(String::toCharArray);



        Optional os = template.describeConstable();
        System.out.println(os);
        System.out.println(os.get());


    }
}
