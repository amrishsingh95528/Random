package com.interface1;

import java.util.Scanner;

interface Client{
	void input();
	void output();
}

public class Developer implements Client {
	int a;
	int b;
	int c;
	public void input() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number, please correct it");
		b=sc.nextInt();
		
		
	}
	public void output() {
		c=a+b;
		
		System.out.println(c);
	}

	public static void main(String[] args) {
		Developer c1=new Developer();
		c1.input();
		c1.output();

	}

}
