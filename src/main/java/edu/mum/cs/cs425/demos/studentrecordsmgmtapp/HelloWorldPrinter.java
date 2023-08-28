package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

public class HelloWorldPrinter {
    public static void printHelloWorld(int[] numbers) {
        for (int num : numbers) {
            if (num % 5 == 0 && num % 7 == 0) {
                System.out.println("HelloWorld");
            } else if (num % 5 == 0) {
                System.out.println("Hello");
            } else if (num % 7 == 0) {
                System.out.println("World");
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 14, 25, 35, 49, 70 };
        printHelloWorld(numbers);
    }

}
