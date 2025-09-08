package com.operations;

public class Arithmetic {

	public static void main(String[] args) {
		
		//ascending triangle

//		for(int row = 1; row<=5; row++) {
//			for(int col = 1; col<=row; col++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//descending triangle
		
//		for(int row = 1; row<=5; row++) {
//			for(int col = row; col<=5; col++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		for(int row = 1; row<=5; row++) {
//			for(int c1 = 1; c1<row; c1++) {
//				System.out.print("  ");
//			}
//			for(int c2 = row; c2<=5; c2++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

//		for(int row=1; row<=5; row++) {
//			for(int space=row; space<5; space++) {
//				System.out.print("  ");
//			}
////			for(int star=1; star<=(2*row-1); star++) {
////				System.out.print("* ");
////			}
//			
//			for(int s1=1; s1<=row; s1++)
//			{
//				System.out.print("* ");
//			}
//			
//			for(int s2=1; s2<row ; s2++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
		for(int row=5; row>=1; row--) 
		{
			for(int c1=row; c1<5; c1++) {
				System.out.print("  ");
			}
//			for(int c2=1; c2<=(2*row-1); c2++) {
//				System.out.print("* ");
//			}
			for(int s1=row; s1>=1; s1--)
			{
				System.out.print("* ");
			}
			
			for(int s2=row; s2>1; s2--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
//		
//		char ch ='A';
//		for(int row=1; row<=5; row++) {
//			for(int c1=row; c1<5; c1++) {
//				System.out.print(" ");
//			}
//			for(int col=1; col<=row; col++) {
//				System.out.print((ch)+" ");
//			}
//			ch++;
//			System.out.println();
//		}
//		
//		for(int row=5; row>=1; row--) {
//			for(int c1=5; c1>=row; c1--) {
//				System.out.print(" ");
//			}
//			for(int col=row; col>1; col--) {
//				System.out.print((ch) +" ");
//			}
//			ch++;
//			System.out.println();
//		}
	}
}

