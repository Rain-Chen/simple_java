package com.qianyan.test.question2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created with Intellij IDEA.
 * <p>Created by rainchen
 * User: rainchen
 * Date: 15-7-26
 * Time: 下午4:34.
 * <p/>
 * Questions about Java Exceptions
 */
public class Question2 {

    public static void main(String[] args) {
        //1.Why variables defined in try can not be used in catch or finally?

        try {
            File file = new File("path");
            FileInputStream fis = new FileInputStream(file);
            String s = "inside";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //the string s declared in try block can not be used in catch clause.
            //System.out.println(s);
        }

        /**
         * The reason is that you don’t know where in the try block the exception would be thrown.
         * It is quite possible that the exception is thrown before the object is declared.
         * This is true for this particular example.
         */
        /**
         * 原因是，你不知道try块中异常在哪儿抛出
         * 很可能是异常在对象在声明之前被声明
         * 这很适合这个特定的例子
         */

        //2.Why do Double.parseDouble(null) and Integer.parseInt(null) throw different exceptions?
        Integer.parseInt(null);//throws java.lang.NumberFormatException
        Double.parseDouble(null);//throws java.lang.NullPointerException

        /**
         * They actually throw different exceptions.
         * This is a problem of JDK. They are developed by different developers,
         * so it does not worth too much thinking.
         */
        /**
         * 事实上他们抛出不同的异常这是JDK的问题，他们来自不同的开发者
         * 所以它不值得过多的考虑
         */

        //3.Commonly used runtime exceptions in Java

        //They can be used in if statement when the condition is not satisfied as follows:
        if (Question2.class.getSigners() == null) throw new IllegalArgumentException("obj can not be null");

    }
}
