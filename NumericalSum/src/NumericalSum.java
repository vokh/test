/*
Describe the algorithm for calculating the numerical sum of a natural number.
Avoid using arrays, strings, and collections.

For example:
given: 2048
2 + 0 + 4 + 8 = 14
*/

import java.util.Scanner;

public class NumericalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        long firstNaturalNumber = sc.nextLong();
        long nm = firstNaturalNumber;
        long sum = 0;
        while (nm != 0){
            sum += nm % 10;
            nm = nm / 10;
        }
        System.out.println("Numerical sum of a natural number '" + firstNaturalNumber +"':\n" + sum);
    }
}
