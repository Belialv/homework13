package com.company;

import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = 0;
        int b = 10;
        int random_number = a + (int) (Math.random() * b);
        System.out.println("испытайте свою удачу:");
        int r = x.nextInt();
        do {
            if (r == random_number) {
                System.out.println("Вам сегодня везет!");
            } else {
                System.out.println("Упс, попробуйте еще раз");
                r = x.nextInt();
                random_number = a + (int) (Math.random() * b);
            }
            System.out.println("Загаданное число: " + random_number);
        }
        while (r != random_number);


    }

    }


