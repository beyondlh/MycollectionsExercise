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
        Path path2 = Paths.get("C:", "rafaelnadal/tournaments/2009", "ZDX.txt");
        Path path3 = Paths.get(System.getProperty("user.home"));


        System.out.println("FileName   :" + path2.getFileName());
        System.out.println("FileSystem :" + path2.getFileSystem());
        System.out.println("Root       :" + path2.getRoot());
        System.out.println("Parent     :" + path2.getParent());
        System.out.println("SubPath    :" + path2.subpath(0,1));
        System.out.println("SubPath    :" + path2.subpath(0,2));
        System.out.println("SubPath    :" + path2.subpath(0,3));
        System.out.println("URI        :" + path2.toUri());
        System.out.println("resolveSibling        :" + path2.resolveSibling("mmm.exe"));
        System.out.println("resolve        :" + path2.resolve(path));
        System.out.println("relativize        :" + path2.relativize(path));


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
