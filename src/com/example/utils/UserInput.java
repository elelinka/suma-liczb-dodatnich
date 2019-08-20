package com.example.utils;

import java.util.LinkedList;
import java.util.Scanner;

public class UserInput {

    public static LinkedList<Integer> getNumbers() {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> numberList = new LinkedList<>();
        int length = 10;

        System.out.println("Wprowadź 10 liczb");
        while (!(numberList.size() == length)) {
            int number = input.nextInt();
            if (number < 0) {
                break;
            } else {
                numberList.add(number);
                input.nextLine();
            }
        }
        return numberList;
    }

    public static void getReverseList(LinkedList<Integer> numberList) {
        for (int i = numberList.size() - 1; i >= 0; i--) {
            System.out.print(numberList.get(i) + " ");
        }
    }

    public static void printSum(LinkedList<Integer> numberList) {
        for (int i = 0; i < numberList.size() - 1; i++) {
            System.out.print(numberList.get(i) + " + ");
        }
        System.out.print(numberList.getLast() + " = " + UserInput.getSum(numberList));
    }

    private static int getSum(LinkedList<Integer> numberList) {
        int result = 0;
        for (int i = 0; i < numberList.size(); i++) {
            result += numberList.get(i);
        }
        return result;
    }
}
