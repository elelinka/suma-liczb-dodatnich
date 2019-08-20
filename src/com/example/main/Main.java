package com.example.main;

import com.example.utils.UserInput;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list;
        list = UserInput.getNumbers();
        System.out.println("Liczby w odwrotnej kolejności:");
        UserInput.getReverseList(list);
        System.out.println();
        System.out.print("Suma liczb: ");
        UserInput.printSum(list);
        System.out.println();
        System.out.println("Największa liczba: " + Collections.max(list));
        System.out.println("Najmniejsza liczba: " + Collections.min(list));
    }
}
