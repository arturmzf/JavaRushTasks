package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = 20;
    }

    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
        this.width = 17;
        this.height = 5;
    }

    public void initialize(int width) {
        this.width = width;
        this.height = 20;
    }

    public static void main(String[] args) {

    }
}
