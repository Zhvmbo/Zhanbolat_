// The Common Reuse Principle
package com.company.Second;
import  com.company.First.Main;
import com.company.First.*;
import java.io.File;
import java.io.IOException;


public class CRP {
    private static CRP monitor = new CRP();
    private String // Initializing at point of definition:
            s1 = new String("Happy"),
            s2 = "Happy",
            s3, s4;
    private String name;
    private int age;

    public CRP() {
        System.out.println("HI there!");
        s3 = new String("Joy");
        age = 28;

    }

    public String toString() {
        if (s4 == null)
            s4 = new String("Joy");
        return
                "s1 = " + s1 + "\n" +
                        "s2 = " + s2 + "\n" +
                        "s3 = " + s3 + "\n" +
                        "s4 = " + s4 + "\n" +
                        "age = " + age + "\n";

    }

    public static void main(String[] args) {
        CRP one = new CRP();
        System.out.println(one);
    }
}