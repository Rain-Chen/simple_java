package com.qianyan.test.question4;

/**
 * Created with Intellij IDEA.
 * <p>Created by rainchen
 * User: rainchen
 * Date: 15-8-8
 * Time: 下午9:59.
 * </p>
 * An enum in Java is just like any other class, with a predefined set of instances. Here
 * are several examples to highlight how to use Java Enum.
 */
public class Question4 {

    public static void main(String[] args) {
        for (Color color : Color.values()){
            System.out.println(color);
        }

        for (ColorWithConstructor color : ColorWithConstructor.values()){
            color.printValue();
        }
    }
}
enum Color{
    RED,YELLOW,BLUE;
}
enum ColorWithConstructor{
    RED(1),YELLOW(2),BLUE(3);//each is an instance of Color

    private int value;

    private ColorWithConstructor(){}

    private ColorWithConstructor(int i){
        this.value = i;
    }

    //define instance method
    public void printValue(){
        System.out.println(this.value);
    }
}
