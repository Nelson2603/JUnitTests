package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    List <Integer> numbers = new ArrayList<>();

   public int plus (int a, int b) {
       return a + b;
   }
   public double divide (double a, double b) {
       return a / b;
   }
   public int minus (int a, int b) {
       return a - b;
   }
   public int multiply (int a, int b) {
       return a * b;
   }

   public boolean isEven (int a) {
       return a % 2 == 0;
   }

   public void addList (int a) {
      if (!numbers.contains(a)) {
          numbers.add(a);
      }
   }

   public void deliteNumber(Integer a) {
       numbers.remove(a);
   }

}
