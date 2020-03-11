package main.java.ch.string;

import java.util.ArrayList;
import java.util.List;

// 13.3 无意识的递归

public class ToStringTest {
    public String toString(){
//        return "ToStringTest address: " + this + "\n";  //error
/*
        Exception in thread "main" java.lang.StackOverflowError
        at main.java.ch.string.ToStringTest.toString(ToStringTest.java:8)
        at java.base/java.lang.String.valueOf(String.java:2951)
*/
        return "ToStringTest address: " + super.toString() + "\n";

    }
    public static void main(String[] args){
        List<ToStringTest> v = new ArrayList<ToStringTest>();
        for(int i = 0; i < 10; i++){
            v.add(new ToStringTest());
        }
        System.out.println(v);
/*      //Output:
        [ToStringTest address: main.java.ch.string.ToStringTest@1e643faf
                , ToStringTest address: main.java.ch.string.ToStringTest@668bc3d5
                , ToStringTest address: main.java.ch.string.ToStringTest@3cda1055
                , ToStringTest address: main.java.ch.string.ToStringTest@7a5d012c
                , ToStringTest address: main.java.ch.string.ToStringTest@3fb6a447
                , ToStringTest address: main.java.ch.string.ToStringTest@79b4d0f
                , ToStringTest address: main.java.ch.string.ToStringTest@6b2fad11
                , ToStringTest address: main.java.ch.string.ToStringTest@79698539
                , ToStringTest address: main.java.ch.string.ToStringTest@73f792cf
                , ToStringTest address: main.java.ch.string.ToStringTest@2ed94a8b
           ]
*/

    }
}
