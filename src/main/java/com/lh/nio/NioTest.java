package com.lh.nio;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

/**
 * Created by lh on 2016/11/1.
 */
public class NioTest {
    public static void main(String[] args) {
        Path path = Paths.get("C:", "rafaelnadal/tournaments/2009", "BNP.txt");

        for (Path name : path) {
            System.out.println(name);
        }

     FileSystem fileSystem = FileSystems.getDefault();
        Set<String > views = fileSystem.supportedFileAttributeViews();
        for (String view : views) {
            System.out.println(view);
        }
    }
}
