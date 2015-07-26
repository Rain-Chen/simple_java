package com.qianyan.test.question3;

/**
 * Created with Intellij IDEA.
 * <p>Created by rainchen
 * User: rainchen
 * Date: 15-7-26
 * Time: 下午5:34.
 * <p/>
 * Why Field Can’t Be Overridden?
 */
public class Question3 {

    //Can Field Be Overridden in Java?
    public static void main(String[] args) {
        Sub sub = new Sub();
        //will print Sub
        System.out.println(sub.s);

        Super sup = new Sub();
        //will print Super
        System.out.println(sup.s);
    }
}

class Super {
    String s = "Super";
}

class Sub extends Super {
    String s = "Sub";
}

/**
 * We did create two Sub objects, but why the second one prints out "Super"?
 * if you want to access super class's s field you can
 * Sub sub = new Sub();
 * System.out.println(((Super)sub).s);
 */
