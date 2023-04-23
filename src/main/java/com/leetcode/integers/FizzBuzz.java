package com.leetcode.integers;

import java.util.InputMismatchException;
import java.util.Scanner;

/*

 */
public class FizzBuzz {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer number ");
        try {
            int n = scanner.nextInt();
            FizzBuzz fb = new FizzBuzz();
            fb.process(n);
        }
        catch (InputMismatchException ex){

            System.out.println("Input was not a integer ");
        }
        catch (Exception ex){
            System.out.println("Error " + ex.getMessage());
        }
    }

    private void process(int n) {
        if (n < 0){
            return;
        }
        for (int i = 1; i<=n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
