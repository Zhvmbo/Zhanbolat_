//The main class
package com.company.First;

import com.company.Second.*;
import com.company.Second.CCP;
import com.company.Second.CRP;
import com.company.Second.REP;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main  {
    public static void main(String[] args) throws IOException{
            CRP first = new CRP();
        System.out.println(first.toString());

            CCP second = new CCP();
        second.setName("Iliyas");
        second.setYear(25);

        System.out.println("Name: " + second.getName());
        System.out.println("Age: " + second.getYear());

        ByteArrayOutputStream third = new ByteArrayOutputStream();

        third.write("hello There!". getBytes());

        third.writeTo(System.out);

    }
}
