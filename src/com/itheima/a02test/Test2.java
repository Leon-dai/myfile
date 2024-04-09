package com.itheima.a02test;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File f = new File("D:\\Code\\aaa");
        System.out.println(haveAVI(f));
    }


    public static boolean haveAVI(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile() && f.getName().endsWith(".mp4")){
                System.out.println(f);
                return true;
            }
        }
        return false;
    }
}
