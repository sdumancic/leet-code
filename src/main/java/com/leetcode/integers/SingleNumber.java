package com.leetcode.integers;

import java.util.InputMismatchException;
import java.util.Scanner;

/*

 */
public class SingleNumber {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in array ");
        try {
            int numOfElements = scanner.nextInt();
            int[] nums = new int[numOfElements];
            for (int i = 0;i < numOfElements; i++){
                nums[i] = scanner.nextInt();
            }
            SingleNumber fb = new SingleNumber();
            fb.process(nums);
        }
        catch (InputMismatchException ex){

            System.out.println("Input was not a integer ");
        }
        catch (Exception ex){
            System.out.println("Error " + ex.getMessage());
        }
    }

    private void process(int[] nums) {
    }


}
