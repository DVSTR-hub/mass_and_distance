package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Выберите, что переводить:");
        System.out.println("[1] - масса\n" +
                           "[2] - расстояние");
        Scanner v = new Scanner(System.in);
        int i = v.nextInt();
        if (i == 1) {
            System.out.println("Выберите единицу измерения:");
            System.out.println("[1] - кг \n" +
                               "[2] - грамм \n" +
                               "[3] - фунт \n" +
                               "[4] - карат");
            i = v.nextInt();
            Count.mass(i);
        } else if (i == 2) {
            System.out.println("Выберите единицу измерения:");
            System.out.println("[1] - метр \n" +
                    "[2] - миля \n" +
                    "[3] - ярд \n" +
                    "[4] - фут");
            i = v.nextInt();
            Count.distance(i);
        }
        else System.out.println("Что-то пошло не так. Попробуй ещё раз :(");


    }
}
