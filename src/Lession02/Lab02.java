package Lession02;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        printStar();
        findIndicies();
    }

    public static void printStar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input line number:");
        int line = Integer.parseInt(scan.nextLine());
        for (int i = line - 1; i >= 0; i--) {
            // for (int i = 0; i <= line; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void findIndicies() {
        int[] arr;
        System.out.print("Input number of element array:");
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        arr = new int[n];
        //Nhập mảng phần tử
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "]=");
            arr[i] = Integer.parseInt(scan.nextLine());
        }
        System.out.println("Input the target number:");
        Scanner sc = new Scanner(System.in);
        int target = Integer.parseInt(sc.nextLine());
        System.out.println("Pair with the input number:");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}


