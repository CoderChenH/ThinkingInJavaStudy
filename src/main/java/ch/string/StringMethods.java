package main.java.ch.string;


import org.junit.Test;

import java.util.*;

/*
* 13.4 String上的操作
* String 方法
* 1》length() ---字符的个数
* 2》charAt(int dex) ---返回索引为index上的字符
* 3》getChars(), getBytes()   ---s.getChars(0,4,charsArray,1);//将s上的索引为[0,4)的内容复制到charsArray目标数组上，从目标数组索引为1处进行复制。
* 4》toCharArray()---生成一个char[],包含String的所有字符
* 5》equals() , equalsIgnoreCase()  ---比较两个String内容是否相等（后者忽略大小写的差异)
* 6》compareTo()---按词典顺序比较String内容，比较结果为负数，零，正数；注意：大小写不等价
* 7》contains()
*    contentEquals() 参数为与之比较的CharSequence或StringBuffer
* 8》regionMatches(该String1的索引偏移量，另一个String2,String2的索引偏移量，要比较的长度) ---返回boolean结果，以表明所在区域是否相等
*    regionMatches(是否忽略大小写差异,该String1的索引偏移量，另一个String2,String2的索引偏移量，要比较的长度) ---返回boolean结果，以表明所在区域是否相等
* 9》startsWith(String s) 判断是否以此参数开始
* 10》endsWith() 判断是否以此参数为后缀
* 11》indexOf(String s) --- 返回s在String中的起始索引，若无，返回-1；
*     lastIndexOf(String str) --- 从后向前搜索，返回str最后一次出现的索引
* 12》substring(int beginIndex, int endIndex) --截取索引为[beginIndex,endIndex)的字符串
* 13》concat(String str) --- 拼接字符串
* 14》trim() ---去除字符串两端的空白字符
* 15》valueOf() --可以把任意类型的数据转成字符串
*       public static String valueOf(各个类型的参数)
* 16》 intern() --- 返回值：一个字符串，内容与此字符串相同，但一定取自具有唯一字符串的池。
* */
public class StringMethods {
    public static void main(String[] args) {

        String s = "hello, this is Java";
        String name = "nameTest";
        System.out.println("s ="+s);      //hello, this is Java
        /*
        length()----String中字符的个数
        * */
        System.out.println("s.length() :" + s.length());        //s.length() :19
        /*
        charAt(int dex)---返回索引为index上的字符
        */
        System.out.println("s.charAt() :" + s.charAt(4));       //s.charAt() :o

        /**
         * getChars(), getBytes()
         * */
        char[] charsArray = new char[10];
        charsArray[0] = 'a';
        charsArray[1] = 'b';
        System.out.println(charsArray);         //ab
        s.getChars(0,4,charsArray,1);//将s上的索引为[0,4)的内容复制到charsArray目标数组上，从目标数组索引为1处进行复制。
        System.out.println(charsArray);         //ahell
        System.out.println("s.getBytes() : " + s.getBytes());   //s.getBytes() : [B@2ed94a8b

        /**
         * toCharArray()---生成一个char[],包含String的所有字符
         */
        System.out.println( s.toCharArray());        //hello, this is Java
        /**
         * equals() , equalsIgnoreCase()  ---比较两个String内容是否相等（后者忽略大小写的差异)
         */
        String s1="Hello, this is Java";
        System.out.println("s1 ="+ s1);
        System.out.println("s.equals(s1) : " + s.equals(s1));       //s.equals(s1) : false
        System.out.println("s.equalsIgnoreCase(s1) : " + s.equalsIgnoreCase(s1));       //s.equalsIgnoreCase(s1) : true
        /**
        * compareTo()---按词典顺序比较String内容，比较结果为负数，零，正数；注意：大小写不等价
        */
        String s3 = "java";
        String s4 = "Java";
        String s5 = "java";
        System.out.println(s3.compareTo(s4));   //32 j的ascii码的值减去J的ascii的值为32
        System.out.println(s3.compareTo(s5));   //为0 表示相等
        System.out.println(s4.compareTo(s5));   //-32 J的ascii码的值减去j的ascii的值为-32

        /**
         * contains()
         * contentEquals() 参数为与之比较的CharSequence或StringBuffer
         */

        /**
         * regionMatches(该String1的索引偏移量，另一个String2,String2的索引偏移量，要比较的长度) ---返回boolean结果，以表明所在区域是否相等
         * regionMatches(是否忽略大小写差异,该String1的索引偏移量，另一个String2,String2的索引偏移量，要比较的长度) ---返回boolean结果，以表明所在区域是否相等
         * */
        String s6 = "HelloWordThisIsJava";
        String s7 = "hellowordthisisjava";
        String s8 = "HelloWorldThisIsJava";
        System.out.println(s6.regionMatches(1,s8,1,4));     //true ；"ello"与"ello"相等
        System.out.println(s6.regionMatches(1,s8,2,4));     //false ；"ello" 与 "llow" 不相等
        System.out.println(s6.regionMatches(1,s7,1,5));     //false;  "ellow" 与 "elloW" 不相等
        System.out.println(s6.regionMatches(false,1,s7,1,5));        //false; 不忽略大小写的差异进行比较
        System.out.println(s6.regionMatches(true,1,s7,1,5));        //true; 忽略大小写的差异进行比较

        /*
        * startsWith(String s) 判断是否以此参数开始
        */
        System.out.println(s6.startsWith("H"));     //true
        System.out.println("Hello".startsWith("h"));     //false
        /*
        * endsWith() 判断是否以此参数为后缀
        * */
        System.out.println("Hello".endsWith("lo"));     //true
        System.out.println("Hello".endsWith("H"));      //false

        /*
        * indexOf(String s) --- 返回s在String中的起始索引，若无，返回-1；
        * lastIndexOf(String str) --- 从后向前搜索，返回str最后一次出现的索引
        * */
        String s9 = "HelloWorld";
        System.out.println(s9.indexOf("o"));        //4
        System.out.println(s9.lastIndexOf("o"));        //6
        System.out.println(s9.indexOf("M"));    //-1

        /*
        * substring(int beginIndex, int endIndex) --截取索引为[beginIndex,endIndex)的字符串
        * */
        System.out.println("----------substring-----------");
        System.out.println(s9.substring(1));        //elloWorld
        System.out.println(s9.substring(1,4));      //ell

        /*
        * concat(String str) --- 拼接字符串
        * */
        System.out.println(s9.concat(" Java"));     //HelloWorld Java

        /*
        * replace(CharSequence target, CharSequence replacement)  --- 将target替换为replacement
        * */
        System.out.println("helloworld".replace("w","W"));      //helloWorld
        System.out.println(s9.replace("ld","--WORLD"));     //HelloWor--WORLD

        /*将字符串进行大小写改变
        * toLowerCase()
        * toUpperCase()
        * */
        System.out.println(s9 + "---" + s9.toLowerCase());   //HelloWorld---helloworld
        System.out.println(s9 + "---" + s9.toUpperCase());   //HelloWorld---HELLOWORLD

        /*
        * trim() ---去除字符串两端的空白字符
        * */
        String s10 = "  Hello     ";
        System.out.println(s10 + "--trim()---" + s10.trim());       //  Hello     --trim()---Hello

        /*
        * valueOf() --可以把任意类型的数据转成字符串
        * public static String valueOf(各个类型的参数)
        * */
        System.out.println(String.valueOf(1));      //1
        System.out.println(String.valueOf(true));       //true

        /*
        * intern() --- 返回值：一个字符串，内容与此字符串相同，但一定取自具有唯一字符串的池。
        * */
        System.out.println(s9.intern());        //HelloWorld

        System.out.println("-------------------");

    }

    @Test
    public void stringSubstringTest(){
        String color = "  ";
        String colors = color + "1234,6789,1234,";


//        System.out.println(colors.length());
//        System.out.println(colors.substring(0,colors.length()-1));
//        System.out.println(colors.trim().length());
//        System.out.println(colors.trim().substring(0,colors.trim().length()-1));

        String colors2 = color + "1234,6789,1234,    ";

        String colors2trim = colors2.trim();
        int length = colors2trim.length();
        System.out.println(colors2trim.substring(0,length-1));
    }

}
