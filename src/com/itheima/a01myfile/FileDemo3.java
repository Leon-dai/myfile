package com.itheima.a01myfile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
    public static void main(String[] args) {
        /*
            public long length()                返回文件的大小（字节数量）
            public String getAbsolutePath()     返回文件的绝对路径
            public String getPath()             返回定义文件时使用的路径
            public String getName()             返回文件的名称，带后缀
            public long lastModified()          返回文件的最后修改时间（时间毫秒值）
         */
        //1.length 返回文件的大小（字节数量）
        //该方法只能获取文件的大小，单位是字节，不能获取文件夹的大小
        File f1 = new File("D:\\Code\\file_test\\a.txt");
        System.out.println(f1.length());

        //2.getAbsolutePath 返回文件的绝对路径
        File f3 = new File("D:\\Code\\file_test\\a.txt");
        System.out.println(f3.getAbsolutePath());

        File f4 = new File("a.txt");
        System.out.println(f4.getAbsolutePath());//D:\Code\IdeaProjects\basic-code\myfile\a.txt

        //3.getPath  返回定义文件时使用的路径
        File f5 = new File("D:\\Code\\file_test\\a.txt");
        System.out.println(f5.getPath());

        File f6 = new File("myfile\\a.txt");
        System.out.println(f6.getPath());

        //4.getName 返回文件的名称，带后缀
        File name1 = new File("D:\\Code\\file_test\\a.txt");
        System.out.println(name1.getName());

        File name2 = new File("D:\\Code\\file_test\\bbb");
        System.out.println(name2.getName());

        //5.lastModified 返回文件的最后修改时间（时间毫秒值）
        File f9 = new File("D:\\Code\\file_test\\a.txt");
        long time = f9.lastModified();
        System.out.println(time);
        Date d = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(d));

    }
}
