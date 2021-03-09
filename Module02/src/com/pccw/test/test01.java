package com.pccw.test;

import java.util.*;

/**
 * @author shkstart
 * @create 2021-01-22 17:40
 */
public class test01 {


    public static void main(String[] args) {

        System.out.println("hello!!!");

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        for (String s1 : list) {
            System.out.println("s1:"+s1);

        }

        Map<String, Integer> map = new HashMap<>();
        map.put("小明",1);
        map.put("小红",2);
        map.put("小三",3);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey()+entry.getValue());
        }



    }


}
