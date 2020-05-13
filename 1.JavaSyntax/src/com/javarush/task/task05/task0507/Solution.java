package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        // System.out.println("Введите первое значение:");
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        int count = 0;
        int data = 0;
        double result = 0;

        do {
            int input = scanner.nextInt();
            if(input != -1) {
                count ++;
                data += input;
                // System.out.println("Введите следующее значение:");
            } else {
                condition = false;
            }
        }while(condition);

        /*
        if(count != 0) {
            result = (double)data / count;
            System.out.println("Среднее арифметическое введённых чисел:");
            System.out.println(result);
        } else {
            System.out.println("Среднее арифметическое не найдено...");
        }
        */

        if(count != 0) {
            result = (double)data / count;
            System.out.println(result);
        }

    }
}

