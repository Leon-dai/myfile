package com.itheima.a01myfile;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        /*
            public boolean createNewFile()      创建一个新的空的文件
            public boolean mkdir()              创建单级文件夹
            public boolean mkdirs()             创建多级文件夹
            public boolean delete()             删除文件、空文件夹
         */

        //1.createNewFile()      创建一个新的空的文件
        /*File f1 = new File("D:\\Code\\aaa\\c.txt");
        boolean b = f1.createNewFile();
        System.out.println(b);*/

        /*File f2 = new File("D:\\Code\\aaa\\bbb\\ccc");
        boolean b = f2.mkdir();
        System.out.println(b);*/

        /*File f2 = new File("D:\\Code\\aaa\\bbb\\ccc");
        boolean b = f2.mkdirs();
        System.out.println(b);*/

        /*File f3 = new File("D:\\Code\\aaa\\c.txt");
        boolean b = f3.delete();
        System.out.println(b);//true*/

        /*File f3 = new File("D:\\Code\\aaa\\bbb\\ccc");
        boolean b = f3.delete();
        System.out.println(b);//true*/

        File f3 = new File("D:\\Code\\aaa\\bbb");
        boolean b = f3.delete();
        System.out.println(b);//false

    }
}
