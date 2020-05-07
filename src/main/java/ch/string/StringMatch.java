package main.java.ch.string;

import org.junit.Test;

import java.util.Arrays;

/**
 * 13.6 正则表达式
 *  1》String类的split() 方法---讲字符串从正则表达式匹配的地方切开
 */
public class StringMatch {

    /**
     * 13.6.1 eg:
     * String类的split() 方法：
     */
    @Test
    public void testMatch(){
        System.out.println("+918".matches("-?\\d+"));   //false

        String knights = "Then, when you have found the shrubbery, you must" +
                "cut down the mightiest tree in the forest... " +
                "with... a herring!";
        System.out.println(Arrays.toString(knights.split(" ")));    //从空格的地方分开
            //[Then,, when, you, have, found, the, shrubbery,, you, mustcut, down, the, mightiest, tree, in, the, forest..., with..., a, herring!]
        System.out.println(Arrays.toString(knights.split("\\W+")));     // \W表示非单词字符（\w表示一个单词字符）
            //[Then, when, you, have, found, the, shrubbery, you, mustcut, down, the, mightiest, tree, in, the, forest, with, a, herring]
        System.out.println(Arrays.toString(knights.split("n\\W+")));    //字母n后跟着一个或多个非单词字符
            //[The, whe, you have found the shrubbery, you mustcut dow, the mightiest tree i, the forest... with... a herring!]

        //联系7：
        //联系8：
        System.out.println("练习8：");
        System.out.println(Arrays.toString(knights.split("the | you")));

    }

}
