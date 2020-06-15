package spring01.my.controller;

/**
 * 在不借助第三个变量的情况下交换两个数据的值
 */
public class aaa {
    public static void main(String[] args) {
        int a = 10;
        int b = 40;
        a = b - a;//a=30
        b = b - a;//b=10
        a = b + a;//a=40
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
