package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public String f = func();

    public String func(){
        return "1";
    }

    public static void main(String[] args) {
        System.out.println(new Test().f);
    }
}
