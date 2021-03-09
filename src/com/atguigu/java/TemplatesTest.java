package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2020-09-11 15:01
 */
public class TemplatesTest {

    //模板六: prsf：可生成 private static final
    private static final Customer cust = new Customer();

    //演变1: psf:  可生成 public static final
    public static final int NUM=1;

    //演变2: psfi：可生成 public static final int
    public static final int NUM2=2;

    //演变3: psfs：可生成 public static final String
    public static final String NATION="china";

    public static void main01() {
        System.out.println("我要回广水!!!");

    }


    public void userme01(String name){
        System.out.println("我想要早点回家:"+name);

    }


    public void userme02(String address, int age){
        System.out.println("我想要早点回家:"+address+",我今年多大:"+age);

    }


    //模板一: psvm
    public static void main(String[] args) {

        //模板二: sout
        System.out.println("hello!!!");

        //演变1: soutp=System.out.println("方法形参名 = " + 形参名);
        System.out.println("args = [" + args + "]");

        //演变2: soutm=System.out.println("当前类名.当前方法");
        System.out.println("TemplatesTest.main");

        //演变3: soutv=System.out.println("变量名 = " + 变量);
        System.out.println("args = " + args);

        //演变4: “abc”.sout => System.out.println("abc");
        System.out.println("abc");

        //模板三: fori(可生成for循环)
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //演变1: iter(增强for循环)
        for (String s : arr) {
            System.out.println(s);
        }

        //演变2: itar(普通for循环)
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四: list.for(增强for循环)
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Object o : list) {
            System.out.println(o);
        }

        //演变1: list.fori(普通for循环正序)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

        //演变2: list.forr(普通for循环倒序)
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(i);
        }

        //模板五: ifn(可生成if(xxx == null))
        if (list == null) {

        }

        //演变1: inn(可生成if(xxx != null))
        if (list != null) {
            
        }

        //演变2: xxx.nn/xxx.null
        //list.null
        if (list == null) {

        }

        //list.nn
        if (list != null) {

        }

        main01();

        TemplatesTest a = new TemplatesTest();
        a.userme01("可以!!!");
        a.userme02("广水",15);


    }




}
