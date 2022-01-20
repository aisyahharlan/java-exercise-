package com.Linkedin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        evennumb();
    }

    public static void calculate() {
        System.out.print("Enter num1 opt num2 (5 * 3) :");

        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        char opt = sc.next().charAt(0);
        double num2 = sc.nextDouble();


        if (opt == '+') {
            System.out.println((int) (num1 + num2));
        } else if (opt == '-') {
            System.out.println((int) (num1 - num2));
        } else if (opt == '/') {
            System.out.println((int) (num1 / num2));
        } else if (opt == '*') {
            System.out.println((int) (num1 * num2));
        } else
            System.out.print("wrong");

    }

    public static void luckyNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int n = sc.nextInt();


        //ABCD
        int fourthDigit = n % 10; //D
        int thirdDigit = ((n / 10) % 10); //C
        int secondDigit = ((n / 100) % 10); // B
        int firstDigit = ((n / 1000) % 10); // A

        if (firstDigit + secondDigit == thirdDigit + fourthDigit) {
            System.out.println("Lucky Number");
        } else {
            System.out.println("Unlucky Number");
        }


    }

    public static void loop() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        while (n < 1 || n > 10) {
            System.out.print(n + " is not between 1 until 10, try again! ");
            n = sc.nextInt();
        }

        System.out.println("n is between 1 - 10");
    }

    public static void doWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number between 1 and 10: ");
        int n = sc.nextInt();

        do {
            System.out.print("enter a number between 1 and 10: ");
            n = sc.nextInt();


        }
        while (n < 1 || n > 10);
        System.out.println(n + " is between 1 and 10");


    }

    public static void nested() {
        for (int i = 0; i < 5; i++) {

            for (int d = 0; d < 2; d++)
                System.out.println(d + " " + " " + i);

            System.out.println();


        }

    }

    public static void star1() {
        Scanner s = new Scanner(System.in);
        System.out.print("enter i : ");
        int i = s.nextInt();
        System.out.print("enter a char : ");
        String star = s.next();


        for (int w = 0; w <= i; w++) {

            System.out.print(star);

            System.out.println();
        }


    }

    public static void star2() {
        Scanner s = new Scanner(System.in);
        System.out.print("enter i : ");
        int i = s.nextInt();
        System.out.print("enter a char : ");
        String star = s.next();


        for (int w = 1; w <= i; w++) {
            for (int t = 1; t <= w; t++)

                System.out.print(w);

            System.out.println();
        }
    }

     public static void star3(){
        Scanner s = new Scanner(System.in);
        System.out.print("enter i : ");
        int i = s.nextInt();
        System.out.print("enter a char : ");
        String star = s.next();


        for (int w = 0; w <= i; w++) {
            for (int t = i; t >= w; t--){
                System.out.print(star);}

            System.out.println();
        }


    }
    public static void star4() {
        Scanner s = new Scanner(System.in);
        System.out.print("enter i : ");
        int i = s.nextInt();
        System.out.print("enter a char : ");
        String star = s.next();


        for (int w = 0; w <= i; w++) {
            for (int t = 1; t <= w; t++) {
                System.out.print(star);
            }

            System.out.println();
        }
        for (int w = 0; w <= i; w++) {
            for (int t = i; t >= w; t--) {
                System.out.print(star);
            }

            System.out.println();
        }
    }
    public static void star5(){

        for (int w = 1; w <= 10; w++) {
            for (int t = 1; t <= 10; t++){


                System.out.print(t * w + " ");

            }

            System.out.println();
        }


    }
    public static int evennumb(){
        for (int i = 1; i <= 100; i += 3)
                System.out.print(i +" ");

    return 0;
    }

}

