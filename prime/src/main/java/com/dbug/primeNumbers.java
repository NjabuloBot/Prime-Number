package com.dbug;

public class primeNumbers {

   String sequence = " ";
   public String primeSequence(int range){
      if(range < 1){
         return sequence;
      }
      else{
         if(range % 2 != 0){
            sequence+=range+" ";
         }
      }
      return primeSequence(range -1);
   }
   
}
