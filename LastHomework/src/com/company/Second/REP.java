// The Reuse-Release Equivalence Principle
package com.company.Second;
import com.company.First.Main;
import com.company.First.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class REP {

    public static void st(String[] args) throws IOException{
        ByteArrayOutputStream first = new ByteArrayOutputStream();

        first.write("hello There!". getBytes());

        first.writeTo(System.out);

    }

}
