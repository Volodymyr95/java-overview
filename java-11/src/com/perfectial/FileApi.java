package com.perfectial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileApi {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("some.txt");


        Files.writeString(path, "some string");
//        String s = Files.readString(path);
//        System.out.println(s);
//
    }
}
