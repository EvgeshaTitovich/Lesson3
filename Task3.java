package com.lessons.lesson3;

import java.util.Random;

/**
 * 3. Написать программу, отображающую статистику по осадкам
 * за N дней. N вводится пользователем.
 *     Пользователь также должен ввести N целых чисел, обозначающих
 * величину осадков в день.
 *     Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 *     Не использовать массивы!
 */
public class Task3 {
    public static void main(String[] args) {
        int N = 12;
        statistic(N);


    }

    public static void statistic(int N) {
        Random random = new Random();
        int sum = 0;
        int maxValue = 0;
        System.out.println("Количество осадков по дням: ");
        for (int i = 0; i < N; i++) {
            int value = random.nextInt(10);
            System.out.print(value + " ");
            sum += value;
            if (maxValue < value) {
                maxValue = value;
            }

        }
        System.out.println();
        System.out.println("Количество дней: " + N);
        System.out.println("Сумма осадков за этот период: " + sum);
        System.out.println("Среднее количество осадков за этот период: " + ((double) sum / N));
        System.out.println("Максимальное кол-во осадков за этот период: " + maxValue);

    }
}
