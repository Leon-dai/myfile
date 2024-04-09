package com.itheima.a01myfile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo7 {
    public static void main(String[] args) {
        /*
            public static File[] listRoots()                        列出可用的文件系统根
            public String[] list()                                  获取当前该路径下所有内容
            public String[] list(FilenameFilter filter)             利用文件名过滤器获取当前该路径下所有内容
            （掌握）publicFile[]listFiles()                          获取当前该路径下所有内容
            public File[] listFiles(FileFilter filter)              利用文件名过滤器获取当前该路径下所有内容
            public File[] listFiles(FilenameFilter filter)          利用文件名过滤器获取当前该路径下所有内容
         */

        //1.listRoots()                        列出可用的文件系统根
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));

        //2.list()                                  获取当前该路径下所有内容
        File f1 = new File("D:\\Code");
        String[] arr1 = f1.list();
        System.out.println(Arrays.toString(arr1));

        //3.list(FilenameFilter filter)             利用文件名过滤器获取当前该路径下所有内容
        //需求：我现在要获取D:\\aaa文件夹里面所有的txt文件
        File f2 = new File("D:\\Code\\aaa");
        String[] arr3 = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return (src.isFile() && name.endsWith(".txt"));
            }
        });
        System.out.println(Arrays.toString(arr3));


    }
}
