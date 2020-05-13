package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int thisCatCount = 0;
        int anotherCatCount = 0;

        if(this.age > anotherCat.age) {
            thisCatCount++;
        } else if(this.age < anotherCat.age) {
            anotherCatCount++;
        }

        if(this.weight > anotherCat.weight) {
            thisCatCount++;
        } else if(this.weight < anotherCat.weight) {
            anotherCatCount++;
        }

        if(this.strength > anotherCat.strength) {
            thisCatCount++;
        } else if(this.strength < anotherCat.strength) {
            anotherCatCount++;
        }

        if(thisCatCount >= anotherCatCount) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

    }
}
