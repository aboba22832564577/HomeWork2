package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum(12, 52));
        System.out.println(sum(32, -20));
        System.out.println(sum(25, 5));
        System.out.println(sum(40, 21));
        System.out.println(sum(70, 52));
        System.out.println(sum(20, 20));
        System.out.println(sum(25, 40));
        System.out.println(sum(20, 58));

    }

    public static String sum(int age, int temp) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return "Можно идти гулять!";
        } else if (age < 20 && temp >= 0 && temp <= 28) {
            return "Можно идти гулять!";
        } else if (age > 45 && temp >= -10 && temp <= 25) {
            return "Можно идти гулять!";
        } else {
            return "Оставайтесь дома!";
        }
    }
}
