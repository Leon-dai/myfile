package com.itheima.a02test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        File file = new File("D:\\Code\\aaa\\src");
        HashMap<String, Integer> hm = getCount(file);
        System.out.println(hm);
    }

    public static HashMap<String, Integer> getCount(File src) {
        //1.定义集合用来统计
        HashMap<String, Integer> hm = new HashMap<>();
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                String name = file.getName();
                String[] arr = name.split("\\.");
                if (arr.length >= 2) {
                    String endName = arr[arr.length - 1];
                    hm.put(endName, hm.getOrDefault(endName, 0) + 1);
                }
            } else {
                HashMap<String, Integer> sonMap = getCount(file);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    Integer val = entry.getValue();
                    hm.put(key, hm.getOrDefault(key, 0) + val);
                }
            }
        }
        return hm;
    }
}
