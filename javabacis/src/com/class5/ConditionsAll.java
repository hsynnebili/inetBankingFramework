package com.class5;

import java.util.Scanner;

public class ConditionsAll {
	public static void main(String[] args) {

		/*
		 * ask user to enter price and boolean value for sale based on the sale we will
		 * check the price: if price<20 -->apply discount 20% and give final price if
		 * price is >20 less 100 -->apply discount 30% and give final price if price is
		 * >100 less 500-->apply discount 50% and give final price
		 */

		/*
		 * 
		 * boolean sale;
		 *  int discount;
		 *   int price; 
		 *   double finalPrice;
		 * 
		 * Scanner scanner =new Scanner(System.in);
		 * System.out.println("Please enter if there is  sale");
		 * sale=scanner.nextBoolean();
		 * 
		 * 
		 * 
		 * if(sale) { 
		 * System.out.println("Let's check all discounts");
		 * System.out.println("Please enter the price of item");
		 * price=scanner.nextInt();
		 * 
		 * if(price<20) { 
		 * discount=20; 
		 * finalPrice=price-(price*0.2);
		 *  }else if(price>=20 && price<100) {
		 *   discount=30; finalPrice=price-(price*0.3); 
		 *   }else if(price>=100 && price<500) { 
		 *   discount=50; 
		 *   finalPrice=price-(price*0.5);
		 * }else { 
		 * discount=75; 
		 * finalPrice=price-(price*0.75); }
		 * System.out.println("Final price is "+finalPrice);
		 *  } else {
		 * System.out.println("Not interested"); }
		 */

		/*
		 * ask user to enter price and boolean value for sale based on the sale we will
		 * check the price: if price<20 -->apply discount 20% and give final price if
		 * price is >20 less 100 -->apply discount 30% and give final price if price is
		 * >100 less 500-->apply discount 50% and give final price
		 */

		/*
		 * int price; 
		 * double discount; 
		 * double fnalPrice=1; 
		 * boolean sale;
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Is there any sale?"); sale = scanner.nextBoolean();
		 * 
		 * if (sale) {
		 * 
		 * System.out.println("Please enter the price of the item"); 
		 * price =scanner.nextInt();
		 * 
		 * System.out.println("Let's check the final price"); 
		 * if (price < 20) { 
		 * discount= 20; 
		 * fnalPrice = price - (price * 0.2); 
		 * } else if (price >= 20 && price <100) { 
		 * discount = 30;
           fnalPrice = price - (price * 0.3); 
           } else if (price >=100 && price < 500) { 
           discount = 50; fnalPrice = price - (price * 0.5);
		 * 
		 * } System.out.println("Final price is: " + fnalPrice); } else {
		 * System.out.println("Not interested"); }
		 * 
		 */

		/*
		 * saleRate-->between 50 and 100-->you will have %5 bonus of your monhtly salary
		 * saleRate-->between 100 and 200-->you will have %10 bonus of your monhtly
		 * salary saleRate-->between 200 and 300-->you will have %15 bonus of your
		 * monhtly salary saleRate-->between 300 and 400-->you will have %20 bonus of
		 * your monhtly salary saleRate-->between 400 and 500-->you will have %25 bonus
		 * of your monhtly salary saleRate-->over 500 -->you will have %30 bonus of your
		 * monhtly salary(monSalary)
		 */

		
		/*
		 boolean campaign;
		 int saleRate; 
		 int monSalary; 
		 double bonus; 
		 double totalCost;
		  
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Do you join this campaign?");
		 campaign=scanner.nextBoolean();
		   
		 if(campaign) { 
			 System.out.println("Please enter your monthly salary");
			 monSalary=scanner.nextInt();
			 System.out.println("Please enter your sale rate");
			 saleRate=scanner.nextInt();
			  if(saleRate>=50 && saleRate<100) { 
		  bonus=5;
		  totalCost=monSalary+(monSalary*0.05); 
		  
		 }else if(saleRate>=100 && saleRate<200) {  
			 bonus=10; 
			 totalCost=monSalary+(monSalary*0.1);
		 }else if(saleRate>=200 && saleRate<300) { 
			 bonus=15; 
			 totalCost=monSalary+(monSalary*0.15);
		}else if(saleRate>=300 && saleRate<400) { 
			bonus=20;
			totalCost=monSalary+(monSalary*0.2);
		}else if(saleRate>=400 && saleRate<500){ 
			bonus=25; 
			totalCost=monSalary+(monSalary*0.25); 
		  
		  }else{ 
		  bonus=30;
		totalCost=monSalary+(monSalary*0.3);
		  }
		   System.out.println("Your total cost is for this month: "+totalCost);
  }else{
            System.out.println("You do NOT want to join that campaign"); }
		

		*/
		
		
/*
 * Do you have any money to deposit for interest? 
 * if it is true-->How much money do you have?
 * if you have 10000-50000-->intRate is % 2.5 and you will earn that money for a year-->(capital+(interest =( (capital x intRate x year) /100))
 * if you have 50000-100000-->intRate is % 3 and you will earn that money for a year-->(capital+(interest =( (capital x intRate x year) / 100))
 * if you have 100000-200000-->intRate is % 3.5 and you will earn that money for a year-->((capital+(interest =( (capital x intRate x year) / 100)) 
 * if you have 200000-5000000-->intRate is % 4 and you will earn that money for a  year-->((capital+(interest =( (capital x intRate x year) / 100))
 * if you have over 5000000-->intRate is % 5 and you will earn that money for a year-->((capital+(interest =( (capital x intRate x year) / 100))
 *if it is NOT true you couldnt have any interest income.
		*/

	
		
		
		int capital;
		double intRate;
		int year = 0;
		boolean deposit;
		double totalCap = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Do yo have any money to deposit for interest");
		deposit = scanner.nextBoolean();
		
		if (deposit) {
			

		
		System.out.println("How much money do you consider to deposit for the interest income");

		capital = scanner.nextInt();
			if (capital >= 10000 && capital < 50000) {
					
					System.out.println("Year: ");
					year=scanner.nextInt();

					intRate = 2.5;
					totalCap = capital +( (capital * 2.5 * year) / 100); //capital +( (capital * intRate * year) / 100);
					System.out.println("Your total money will be  " + totalCap + " for " + year + " year(s)");
				}else if (capital >= 50000 && capital < 100000) {
					
					intRate = 3;
					totalCap = capital + (capital * 3 * year) / 100;
					System.out.println("Your total money will be  " + totalCap + " for " + year + " year(s)");
				} else if (capital >= 100000 && capital < 200000) {
					year=1;
					intRate = 3.5;
					totalCap = capital + (capital * 3.5 * year) / 100;
					System.out.println("Your total money will be  " + totalCap + " for " + year + " year(s)");
				} else if (capital >= 200000 && capital < 500000) {
					
					intRate = 4;
					totalCap = capital + (capital * 4 * year) / 100;
					System.out.println("Your total money will be  " + totalCap + " for " + year + " year(s)");
				} else if (capital>500000) {
					
					intRate = 5;
					totalCap = capital + (capital *5* year) / 100;
					System.out.println("Your total money will be  " + totalCap + " for " + year + " year(s)");
				}
				else {
				System.out.println("Forget about loan.");
				}
			 
		}else{
	        System.out.println("You will NOT have any interest income");
 }


 }
 }
