package com.lambdaproject;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterfaceProgram {

	public static void main(String[] args) {
		//length of the string using function interface 
		Function<String, Integer> fob=(s)->s.length();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		int l=fob.apply(str);
		System.out.println("length of the string= "+l);

	}

}
