package com.itheima.a02test;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //需求：在当前模块下的aaa文件夹中创建一个a.txt文件

        //1.创建a.txt的父级路径
        File file = new File("aaa");
        //2.创建父级路径
        //如果aaa是存在的，那么此时是创建失败的
        boolean b = file.mkdirs();
        System.out.println(b);
        File file1 = new File(file, "a.txt");
        boolean b1 = file1.createNewFile();
        System.out.println(b1);

    }
}
