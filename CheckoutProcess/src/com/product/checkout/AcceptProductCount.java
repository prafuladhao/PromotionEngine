package com.product.checkout;

import java.util.Scanner;


public class AcceptProductCount {
	
	public void acceptProductQuantity() {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			String value;
			do {
			
				System.out.print("Enter quantity for SKU A : ");
				Integer a_count = sc.nextInt();
				
				System.out.print("Enter quantity for SKU B : ");
				Integer b_count = sc.nextInt();
				
				System.out.print("Enter quantity for SKU C : ");
				Integer c_count = sc.nextInt();
				
				System.out.print("Enter quantity for SKU D : ");
				Integer d_count = sc.nextInt();
				
//				System.out.println(a_count+" "+b_count+" "+c_count+" "+d_count);
				
				CalculateAmount amount = new CalculateAmount();
				
				Double amountA, amountB, amountCandD, total;
				
				amountA = amount.CalculateSkuA(a_count);
				amountB = amount.CalculateSkuB(b_count);
				amountCandD = amount.CalculateSkuCAndD(c_count, d_count);
				
				total = amountA + amountB + amountCandD;
				
				System.out.println("Amount for A : "+amountA);
				System.out.println("Amount for B : "+amountB);
				System.out.println("Amount for C And D : "+amountCandD);
				System.out.println("Total Payable Amount : "+total);
				
				System.out.println("Do You Want to Continue(Y/N) :");
				value = sc.next();
			} while (value.equals("Y")||value.equals("y"));
		}
	}
}
