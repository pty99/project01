package com.pty.java;

import com.pty.bean.Customer;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2020-02-19 15:01
 */
public class TemplatesTest {

    /**
     * 注释
     */
    private int num3 = 3;


    // 模板六:prsf
    private static final Customer CUST = new Customer();

    //变形:psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形: psfs
    public static final String NATION = "chima";


    //模板一: psvm
    public static void main(String[] args) {

        //模板二:sout
        System.out.println("hello");
        // 变形:soutp / soutm /soutv /xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num1  = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1);
        System.out.println(num1);

        //模板三:fori
        String[] arr = new String[]{"Tom","Jerry","hangmeimei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
          System.out.println(o);
        }
        //变形:list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形:list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }
    
    public void mothod(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(456);
        list.add(789);
        
        //模板五:ifn
        if (list == null) {
            
        }
        //变形:inn
        if (list != null) {

        }

        //变形:xxx.nn/xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
        
    }

    public void UpdateTest(){

    }


}
