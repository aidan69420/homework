package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите свой возраст и температуру на улице");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int temp = sc.nextInt();
        System.out.println(result(age, temp));
    }
    public static String result(int age, int temp){
        if (age > 20 && age < 45 && temp > -20 && temp < 30)
            return "Можно идти гулять!";
        else if (age < 20 && temp > 0 && temp < 28)
            return "Можно идти гулять!";
        else if (age > 45 && temp > -10 && temp < 25)
            return "Можно идти гулять!";
        else
            return "Оставайтесь дома!";
    }
    public static void
}