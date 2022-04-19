package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void printSeparator() {
        System.out.println("+++++++");
        System.out.println("-------");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        return sum;
    }

    public static void years(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }
    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }
    public static int exitAdd(String name){
        int currentYear = 2022;
        int ios = 0;
        int and = 1;
        int clientOs = getClientOS(name);
        if (clientOs == 1 && currentYear <2015){
            System.out.println("down light");
        } else if (clientOs == 1 && currentYear >=2015) {
            System.out.println("down normal"); }
        if (clientOs== 0 && currentYear <2015) {
            System.out.println("down light ios");
        } else if (clientOs == 0 && currentYear >=2015) {
            System.out.println("down normal ios"); }

        return currentYear;
    }
    public static int dostavka(int deliveryDistances){
        int deliveryDays = 1;
        if (deliveryDistances <=20) {
            System.out.println("доставка займет " + deliveryDays);
        } else if (deliveryDistances >20 && deliveryDistances <60) {
            System.out.println("доставка займет " + (deliveryDays + 1));
        } else if (deliveryDistances >=60 && deliveryDistances <=100) {
            System.out.println("доставка займет " + (deliveryDays +2));
        } else {
            System.out.println("на такое расстояние не ездят");
        }
        return deliveryDistances;
    }
    public static void fapFap (){
        int [] rembo = {3, 2, 1, 6, 5};
        String kakaha = Arrays.toString(rembo);
        StringBuilder kakaha2 = new StringBuilder(kakaha);
        System.out.println(kakaha2.reverse());
    }
    public static void ermak(){
        String str = "aabccddefgghiijjkk";
        char[] carray = str.toCharArray();
        System.out.println("строка " + str);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] issueByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issueByMonths.length; i++) {
            System.out.println(issueByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }

        }
        printSeparator();
        int total = sum(issueByMonths);
        printIssues(total);



        /// ДЗ_1
        int year = 1601;
        years(year);
        /// dz_2   // не уверен в решении этой задачи изза того, что версия опер системы я меняю вручную с 1 на 0 и с 0 на 1
        String osName = "IOS";
        exitAdd(osName);
        /// задача 3
        int deliveryDistances = 500;
        int dddd = dostavka(deliveryDistances);
        // задача 5
        fapFap(); // я решил преобразовать массив в строку и далее строку в изменяемую строку и развернул массив
        // задача 4
        ermak(); // нужна помощь в решении задачи, я не понимаю как мне с помощью цикла сказать что
        // есть дубли да еще и показать какие ..............
    }
}
