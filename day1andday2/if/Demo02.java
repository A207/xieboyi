package com.geminno.demo;

import java.util.Scanner;

public class Demo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scanner=new Scanner(System.in);
           int score=scanner.nextInt();
           if (score>=90)
           {
        	   System.out.println("A");
           	   
           }
           else if
           (score>=80)
           {
        	   System.out.println("B");
	}
           else if
           (score>=70)
           {
        	   System.out.println("C");
	}
           else if
           (score>=60)
           {
        	   System.out.println("D");
	}
           else
        	   System.out.println("E");



}
}