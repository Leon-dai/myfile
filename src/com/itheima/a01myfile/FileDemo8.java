package com.itheima.a01myfile;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {
          /*
            （掌握）publicFile[]listFiles()                          获取当前该路径下所有内容
         */

        File f1 = new File("D:\\Code\\aaa");
        File[] arr = f1.listFiles();
        for (File file : arr) {
            if(file.isFile() && file.getName().endsWith(".txt")){
                System.out.println(file);
            }
        }
    }
}
