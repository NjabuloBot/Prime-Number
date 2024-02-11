package com.dbug;

import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      while(true){
         System.out.print("Enter a number range: ");
         int input = Math.abs(scan.nextInt());
         if(input < 1){
            System.out.println("Range value must be > 0.");
            continue;
         }else{
            primeNumbers numbers = new primeNumbers();
            System.out.println("Prime numbers below "+input+" are: "+numbers.primeSequence(input));
         }
         scan.close();
         break;
      }
   }
}