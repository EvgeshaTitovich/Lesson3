package com.lessons.lesson3;

/**
 * 2. Написать программу, вычисляющую и отображающую все числа
 * Фибоначчи меньше введённого пользователем целого числа.
 */
public class Task2 {

    public static void main(String[] args) {
        int value = 88;
        numbers(value);

    }

    public static void numbers(int value) {
        int value1 = 1;
        int value2 = 1;
        int value3 = 0;
        System.out.print(value1 + " " + value2 + " ");

        for (int i = 3; i > 0; i++) {
            value3 = value2 + value1;
            if (value < value3) {
                break;
            }
            System.out.print(value3 + " ");
            value1 = value2;
            value2 = value3;

        }
    }

}
