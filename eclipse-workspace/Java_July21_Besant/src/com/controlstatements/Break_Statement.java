package com.controlstatements;

public class Break_Statement {

	public static void main(String[] args) {
	//	for(int j=1; j<7; j++) {
	//		if(j==3) {
	//		System.out.println(j);	  //           break;
             
//	}
 //    System.out.println(j);
//	}
    outerloop : for(int row =1; row<=5; row++) {
    	
    innerloop : for(int col=1; col<=5; col++) {
    		if(row==3 && col==2) {
    			break outerloop;
    		}
    		System.out.println(row + " " + col );
    	}
    }
		
		
		
  }
}