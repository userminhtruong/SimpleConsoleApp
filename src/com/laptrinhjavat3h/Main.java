package com.laptrinhjavat3h;
import java.util.Scanner;

import com.laptrinhjavat3h.utils.Util;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("This is a program to input and calculate tax bill of bought device!");
        do {
            Util.calculateBillTax(reader);
            System.out.print("Do you want to continue?(Y/N)  ");
        } while (reader.next().equalsIgnoreCase("y"));
        reader.close();
    }
}
