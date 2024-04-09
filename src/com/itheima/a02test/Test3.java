package com.itheima.a02test;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File f = new File("C:\\");
        findMP4(f);
    }

    public static void findMP4(File src){
        //1.进入文件夹
        File[] files = src.listFiles();
        if(files != null){
            //2.遍历数组，依次得到src中的每一个文件或者文件夹
            for (File file : files) {
                //3.判断，如果是文件
                if(file.isFile()){
                    String name = file.getName();
                    if(name.endsWith(".mp4")){
                        System.out.println(file);
                    }
                }else{
                    //4.判断，如果是文件夹
                    findMP4(file);
                }
            }
        }
    }
}
