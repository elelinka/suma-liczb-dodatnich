package com.example.utils;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UserInput {

    public static List<Integer> getNumbers() {
        Scanner input = new Scanner(System.in);
        List<Integer> numberList = new LinkedList<>();

        System.out.println("Wprowadź liczby");
        int number;
        while ((number = input.nextInt()) > 0) {
            numberList.add(number);
            input.nextLine();
        }
        return numberList;
    }

    public static void getReverseList(List<Integer> numberList) {
        for (int i = numberList.size() - 1; i >= 0; i--) {
            System.out.print(numberList.get(i) + " ");
        }
    }

    public static void printSum(LinkedList<Integer> numberList) {
        for (int i = 0; i < numberList.size() - 1; i++) {
            System.out.print(numberList.get(i) + " + ");
        }
        System.out.print(numberList.getLast() + " = " + getSum(numberList));
    }

    private static int getSum(List<Integer> numberList) {
        int result = 0;
        for (int i = 0; i < numberList.size(); i++) {
            result += numberList.get(i);
        }
        return result;
    }
}
