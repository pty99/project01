package com.pty.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {

    public HelloWorld() {
    }

    private static final int INIT_SIZE = 10;

    public static void main(String[] args){

        System.out.println("helloworld!");

        ArrayList list = new ArrayList();

        new Date();

        list.add(1,1);
        list.add(2, 2);






    }
    //新方法
    public void method(){

    }

    public static void method1(){
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
