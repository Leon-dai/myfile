package com.itheima.a01myfile;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        File file = new File("D:\\Code\\file_test");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
