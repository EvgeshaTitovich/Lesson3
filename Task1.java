package com.lessons.lesson3;

/**
 * 1. Написать программу, вычисляющую сумму цифр введённого
 * пользователем целого числа.
 */
public class Task1 {

    public static void main(String[] args) {
        int value = 333333;
        int result = sum(value);
        System.out.println(result);
    }

    public static int sum(int value) {
        int result = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            result += currentValue % 10;
        }
        return result;
    }

}
