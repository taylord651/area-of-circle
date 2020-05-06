package com.company;

import java.util.Scanner;

public class Main {

    //feat/4: Create method to calculate area
    public static int areaOfRectangle(int length, int width){
        int area = length * width;
        return area;
    }

    public static void main(String[] args) {
	// feat/1: Setup the following variables (int length, int width, Scanner input)
        int length;
        int width;
        Scanner input;

    // feat/2: Ask user to enter a length and set user entry to the int length variable
        input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        length = input.nextInt();

    // feat/3: Ask user to enter a width and set user entry to the int width variable
        System.out.println("Please enter the width of the rectangle: ");
        width = input.nextInt();
        input.close();
        System.out.println(areaOfRectangle(length,width));
    }
}
