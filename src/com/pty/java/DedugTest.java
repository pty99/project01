package com.pty.java;

import java.util.HashMap;

/**
 * @author pty
 * @create 2020-02-22 14:32
 */
public class DedugTest {
    public static void main(String[] args) {



        HashMap<String, String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);


    }
}
