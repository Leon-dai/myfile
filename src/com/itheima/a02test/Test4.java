package com.itheima.a02test;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File f = new File("D:\\Code\\aaa");
        deleteFile(f);
    }

    public static void deleteFile(File src) {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            } else {
                deleteFile(file);
            }
        }
        src.delete();
    }
}
