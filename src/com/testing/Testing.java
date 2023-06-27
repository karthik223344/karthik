package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.testcases1.Calculation;  


public class Testing {
   @Test
   public void add() {
	   assertEquals(10, Calculation.add(5,5));
	 
   }
   @Test
   public void sub() {
	   assertNotEquals(30, Calculation.sub(10, 10));
   }
   
   

}
