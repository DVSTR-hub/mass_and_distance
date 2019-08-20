package com.company;
import java.util.Scanner;

public class Count {
    static void mass(int i) {

        System.out.println("Введите число:");
        Scanner v = new Scanner(System.in);
        double num = v.nextDouble();
        switch (i) {
            case 1:
                System.out.println("Результат:");
                System.out.println("Килограммы: " + num + "\n" +
                        "Граммы: " + num * 1000 + "\n" +
                        "Фунты: " + num * 2.2046223302272 + "\n" +
                        "Караты: " + num * 5000);
                break;
            case 2:
                System.out.println("Результат:");
                System.out.println("Граммы: " + num + "\n" +
                        "Килограммы: " + num / 1000 + "\n" +
                        "Фунты: " + num / 1000 * 2.2046223302272 + "\n" +
                        "Караты: " + num / 1000 * 5000);
                break;
            case 3:
                System.out.println("Результат:");
                System.out.println("Фунты: " + num + "\n" +
                        "Килограммы: " + num * 0.45359243 + "\n" +
                        "Граммы: " + num * 453.59243 + "\n" +
                        "Караты: " + num * 0.45359243 * 5000);
                break;
            case 4:
                System.out.println("Результат:");
                System.out.println("Караты: " + num + "\n" +
                        "Килограммы: " + num * 0.0002 + "\n" +
                        "Граммы: " + num * 0.2 + "\n" +
                        "Фунты: " + num * 0.00044092446604543 + "\n");
                break;
            default:
                System.out.println("Что-то пошло не так. Попробуй ещё раз :(");
        }
    }

    static void distance(int i) {

        System.out.println("Введите число:");
        Scanner v = new Scanner(System.in);
        double num = v.nextDouble();
        switch (i) {
            case 1:
                System.out.println("Результат:");
                System.out.println("Метры: " + num + "\n" +
                        "Мили: " + num * 0.00062137119223733 + "\n" +
                        "Ярды: " + num * 1.0936132983377 + "\n" +
                        "Футы: " + num * 3.2808398950131);
                break;
            case 2:
                System.out.println("Результат:");
                System.out.println("Мили: " + num + "\n" +
                        "Метры: " + num * 1609.344 + "\n" +
                        "Ярды: " + num * 1760 + "\n" +
                        "Футы: " + num * 5280);
                break;
            case 3:
                System.out.println("Результат:");
                System.out.println("Ярды: " + num + "\n" +
                        "Метры: " + num * 0.9144 + "\n" +
                        "Мили: " + num * 0.00056818181818182 + "\n" +
                        "Футы: " + num * 3);
                break;
            case 4:
                System.out.println("Результат:");
                System.out.println("Футы: " + num + "\n" +
                        "Метры: " + num * 0.3048 + "\n" +
                        "Мили: " + num * 0.00018939393939394 + "\n" +
                        "Ярды: " + num * 0.33333333333333);
                break;
            default:
                System.out.println("Что-то пошло не так. Попробуй ещё раз :(");
        }


    }
}











