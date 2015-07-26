package com.qianyan.test.question1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with Intellij IDEA.
 * <p>Created by rainchen
 * User: rainchen
 * Date: 15-7-26
 * Time: 上午11:37.
 * <p/>
 * Question : How to Check if an Array Contains a Value in Java Efficiently?
 * <p/>
 * Description : How to check if an array (unsorted) contains a certain value? This is a very useful
 * and frequently used operation in Java. It is also a top voted question on Stack Overflow.
 * As shown in top voted answers, this can be done in several different ways,
 * but the time complexity could be very different.
 * In the following I will show the time cost of each method.
 */
public class Question1 {

    //Four Different Ways to Check If an Array Contains a Value

    //1.Using List:
    public static boolean useList(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }

    //2.Using Set
    public static boolean useSet(String[] arr, String targetValue) {
        Set<String> set = new HashSet<String>(Arrays.asList(arr));
        return set.contains(targetValue);
    }

    //3.Using a simple loop
    public static boolean useLoop(String[] arr, String targetValue) {
        for (String s : arr) {
            if (s.equals(targetValue)) return true;
        }
        return false;
    }

    //4.Using Arrays.binarySearch():
    // * The code below is wrong, it is listed here for completeness.
    // binarySearch() can ONLY be used on sorted arrays.
    // You will see the result is weird when running the code below.
    public static boolean useArraysBinarySearch(String[] arr, String targetValue) {
        int a = Arrays.binarySearch(arr, targetValue);
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }


}
