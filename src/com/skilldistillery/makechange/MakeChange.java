package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String result;
		
		System.out.println("Welcome to MakeChange");
		System.out.println("Please enter the price of the item");
		double price = kb.nextDouble();
		System.out.println("Please enter the tender");
		double pay = kb.nextDouble();
		
		result = check(price, pay);
		
		System.out.println("Amount: " + price + ",Tendered: " + pay + ",Result: " + result);
		kb.close();
	}
	
	public static String check(double price, double pay) {
		String result;
		
		if (price > pay) {
			return result = "The tender is not enough";
		}
		
		else {
			return result = calculate(price, pay);
		}
		
	}
	
	public static String calculate(double price, double pay) {
		double total = pay - price;
		double twenty = 20;
		double ten = 10;
		double five = 5;
		double one = 1;
		double quarter = .25;
		double dime = .10;
		double nickel = .05;
		double penny = .01;
		String output = " ";
		
		while (total != 0) {
			
			if (total > 20) {
			    twenty = Math.floor(total / twenty);
				total = total % 20;
				if (twenty > 1) {
					output = output + (twenty) + " twenty dollar bills, ";
				}
				else {
					output = output + (twenty) + " twenty dollar bill, ";
					
				}
			}
			
			else if (total > 10) {
			    ten = Math.floor(total / ten);
				total = total % 10;
				if (ten > 1) {
					output = output + (int) (ten) + " ten dollar bills, ";
				}
				else {
					output = output + (int) (ten) + " ten dollar bill, ";
					
				}
			}
			
			else if (total > 5) {
			    five = Math.floor(total / five);
				total = total % 5;
				if (five > 1) {
					output = output + (int) (five) + " five dollar bills, ";
				}
				else {
					output = output + (int) (five) + " five dollar bill, ";
					
				}
			}
			
			else if(total > 1) {
			    one = Math.floor(total / one);
				total = total % 1;
				if (one > 1) {
					output = output + (int) (one) + " one dollar bills, ";
				}
				else {
					output = output + (int) (one) + " one dollar bill, ";
					
				}
			}
			
			else if(total > .25) {
			    quarter = Math.floor(total / quarter);
				total = total % .25;
				if (quarter > 1) {
					output = output + (int) (quarter) + " quarters, ";
				}
				else {
					output = output + (int) (quarter) + " quarter, ";
					
				}
			}
			
			else if(total > .10) {
				dime = Math.floor(total / dime);
				total = total % .1;
				if (dime > 1){
					output = output + (int) (dime) + " dimes, ";
				}
				else {
					output = output + (int) (dime) + " dime, ";
					
				}
			}
			
			else if(total > .05) {
				nickel = Math.floor(total / nickel);
				total = total % .05;
				if (nickel > 1) {
					output = output + (int) (nickel) + " nickels, ";
				}
				else {
					output = output + (int) (nickel) + " nickel, ";
					
				}
			}
			
			else if(total > .01) {
				penny = Math.round(total / penny);
				total = total % .01;
				if (penny > 1){
					output = output + (int) (penny) + " pennies.";
				}
				else {
					output = output + (int) (penny) + " penny.";
				}
			}
			else {
				total = 0;
			}
		}
	
		return output;
				
	}
	
}
