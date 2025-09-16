package com.controlstatements;

public class Nested_Forloop {

	public static void main(String[] args) {
		
        //  for(int row =1; row<4; row++) {
        //	System.out.println(row);
        	  
         // for(int col =1; col<=3; col++) {
        //	System.out.println(col);  
        	 
        	//  }
           //}
          
          for(int rows =1; rows<=5; rows++) {
        	  for(int col =1;col<=rows; col++) {
        		  System.out.print("*");
        	  }
          
          System.out.println();
          }
          
      }
	
  }

// row 1   col 1 col 2 col 3 line no 7 to 11 explanation
// row 2   col 1 col 2 col 3
// row 3   col 1 col 2 col 3

//*     row 1 => 1 col     4 empty line no 16 to
//**    row 2 => 2 col     3 empty 
//***   row 3 => 3 col     2 empty
//****  row 4 => 4 col     1 empty
//***** row 5 => 5 col     0 empty

// Day - 11  4/08/2025

