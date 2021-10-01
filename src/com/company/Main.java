package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("Введите температуру на улице, а ваш возраст я попробую угадать" + "\n" + result(generateRandomAge(), new Scanner(System.in).nextInt()));
        }
        
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
            public static int generateRandomAge(){
                Random r = new Random;
                return r.nextInt((100-0) + 1);
            }
    
}
