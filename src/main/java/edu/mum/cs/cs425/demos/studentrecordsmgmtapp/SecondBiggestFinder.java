package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

public class SecondBiggestFinder {

    public static int findSecondBiggest(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Array should contain at least two numbers.");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] numbers1 = { 31, 8, 13, 4, 15 };
        System.out.println("Second biggest among [31, 8, 13, 4, 15] is : " + findSecondBiggest(numbers1));

        System.out.println("-----------------" );

        int[] numbers2 = { 19, 19, 11, 0, 12 };
        System.out.println("Second biggest among [19, 19, 11, 0, 12] is : " + findSecondBiggest(numbers2));
    }
}
