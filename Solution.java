package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String buf = reader.readLine();

            if (buf.equals("helicopter")) result = new Helicopter();
            else {
                result = new Plane(Integer.parseInt(reader.readLine()));
            }

            reader.close();
        }

        catch (Exception e) {
            System.out.println(e + " : " + e.getMessage());
        }
    }
}
