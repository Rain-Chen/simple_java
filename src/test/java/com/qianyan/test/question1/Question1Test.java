package com.qianyan.test.question1;

import org.junit.Test;

import java.util.Random;

/**
 * The approximate time cost can be measured by using the following code.
 * The basic idea is to search an array of size 5, 1k, 10k.
 * The approach may not be precise, but the idea is clear and simple.
 */
public class Question1Test {

    @Test
    public void testTimeComplexity() {
        String[] arr = new String[]{"CD", "BC", "EF", "DE", "AB"};

        //use list
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            Question1.useList(arr, "A");
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("useList: " + duration / 1000000);

        //use set
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            Question1.useSet(arr, "A");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useSet: " + duration / 1000000);

        //use loop
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            Question1.useLoop(arr, "A");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useLoop: " + duration / 1000000);

        //use Arrays.binarySearch()
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            Question1.useArraysBinarySearch(arr, "A");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useArraysBinarySearch: " + duration / 1000000);
    }

    /**
     * result:
     * <p/>
     * useList: 13
     * useSet: 85
     * useLoop: 2
     * useArraysBinarySearch: 8
     */

    //Use a larger array (1k)
    @Test
    public void testTimeComplexity1() {

        String[] arr = new String[1000];
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            arr[i] = String.valueOf(random.nextInt());
        }

        /*
        for (int i = 0; i < 1000; i++) {
            System.out.println(arr[i]);
        }
        */

        //use list
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            Question1.useList(arr, "A");
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("useList: " + duration / 1000000);

        //use set
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            Question1.useSet(arr, "A");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useSet: " + duration / 1000000);

        //use loop
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            Question1.useLoop(arr, "A");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useLoop: " + duration / 1000000);

        //use Arrays.binarySearch()
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            Question1.useArraysBinarySearch(arr, "A");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useArraysBinarySearch: " + duration / 1000000);
    }

    /**
     * result:
     * useList: 129
     * useSet: 2849
     * useLoop: 122
     * useArraysBinarySearch: 14
     *
     * Note:clearly the Set very slow...the console will be hold
     * you can set the number to 100000(10K) try it !
     */


    /**
     *  Clearly, using a simple loop method is more efficient than using any collection.
     *  A lot of developers use the first method, but it is inefficient.
     *  Pushing the array to another collection requires spin through all elements to read them in before doing anything with the collection type.
     *  The array must be sorted, if Arrays.binarySearch() method is used. In this case, the array is not sorted, therefore, it should not be used.
     *  Actually, if you really need to check if a value is contained in some array/collection efficiently,
     *  a sorted list or tree can do it in O(log(n)) or hashset can do it in O(1).
     */
    /**
     *  很明显，使用一个简单地循环方法比使用任何集合效率更高。很多开发者使用第一种方法，但是它是低效地
     *  把数组移动到其他集合之前需要遍历所有元素
     *  如果使用Arrays.binarySearch()方法，数组必须是被排序地，在这个例子中，数组是没有被排序地，因此，它不应该被使用
     *  其实，如果你真的想要有效地检测一个值是否是在数组或者集合中
     *  一个被排序的List或者Tree可以在时间复杂度O(log(n))内完成，或者hashset可以在O(1)内完成
     */
}