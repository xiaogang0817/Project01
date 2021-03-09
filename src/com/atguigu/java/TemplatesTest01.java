package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaogang
 * @create 2021-03-05 10:15
 */
public class TemplatesTest01 {


    //prsf
    private static final Customer cust = new Customer();

    //psvm
    public static void main(String[] args){

        System.out.println();

        System.out.println("args = [" + args + "]");

        System.out.println("TemplatesTest01.main");

        int num1=10;
        int num2=20;
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

        System.out.println(num1);

        String[] arr = new String[]{"tom","jack","hanmeimei","poul","lilei"};
        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println("01:" + arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println("02:" + s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s2 = arr[i];
            System.out.println("03:" + s2);
        }


        List<String> list = new ArrayList();
        list.add("4");
        list.add("6");
        list.add("5");
        list.add("9");
        list.add("2");
        //list.for
        for (String s : list) {
            System.out.println("list.for:" + s);

        }
        //list.fori-顺序查询
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.fori:" + list.get(i));

        }
        //list.forr-倒叙查询
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("list.forr:" + list.get(i));
        }




    }




}
