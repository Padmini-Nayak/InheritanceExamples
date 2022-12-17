package practice.java.programs;

import java.util.Scanner;

public class DemoStringAndArraysMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char str[]=s.toCharArray();
		
		for(int i =0;i<str.length;i++) {
			if(str[i] >= 'A' && str[i]<= 'Z') {
				str[i] = (char) ((int)str[i]+32);
			}
			
		}
		System.out.println("String is lower case is ");
		for(int i =0;i<str.length;i++) {
			System.out.print(str[i]);
		}
		//String s= "Padmini";
	//	StringBuffer sb = new StringBuffer("Padmini");
		
	
	//String revStr = "";
	
	//int length = s.length();
//	
//	for(int i=length-1;i>=0;i--) {
//		//System.out.println(i);
//		revStr += s.charAt(i);
//		//System.out.println("The reversed string name is "+revStr);
//	}
		
	}
	
	

}
