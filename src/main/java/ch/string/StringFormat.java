package main.java.ch.string;

import java.util.Formattable;
import java.util.Formatter;

/*
* 13.5 格式化输出
* */
public class StringFormat {
    public static void main(String[] args) {
        /*
        * System.out.format()
        * */
        int x = 5;
        double y = 5.1314926;
        //the old way:
        System.out.println("Row1 : [" + x + " " + y + "]");     //Row1 : [5 5.1314926]
        //the new way:
        System.out.format("Row1 : [%d %f]\n",x,y);      //Row1 : [5 5.131493]
        //or
        System.out.printf("Row1 : [%d %f]\n",x,y);      //Row1 : [5 5.131493]
        //format() 与 printf() 是等价的

        /*
        * 练习4
        * 
        * */
        System.out.println("-----------");
        int width = 15;
        Formatter f = new Formatter(System.out);
        String itemFormt="%-"+ width +"s %"+ width +"s %"+ width +"s\n";
        f.format(itemFormt,"Item","Qty","Price");
        /**output:
         *
         * -----------
         * Item                        Qty           Price
         */


    }


}
