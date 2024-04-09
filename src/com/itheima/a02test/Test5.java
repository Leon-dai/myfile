package com.itheima.a02test;

import java.io.File;
import java.util.HashMap;

public class Test5 {
    static HashMap<String, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        File file = new File("D:\\Code\\aaa\\src");
        System.out.println(getLen(file));
    }

    public static long getLen(File src){
        //1.定义变量进行累加
        long len = 0;

        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                len += file.length();
            } else {
                len += getLen(file);
            }
        }
        return len;
    }

}
