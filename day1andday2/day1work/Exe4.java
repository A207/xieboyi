package com.geminno.demo;

import java.util.Scanner;

public class Exe4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
       System.out.println("Select an option (1,2,3)");
       System.out.println("|1.增加一个学生|");
      System.out.println("|2.显示全部学生|");
      System.out.println("|3.退出程序|");
       int choice=in.nextInt();
       switch (choice){
       case 1:System.out.println("增加一个学生"); 
           break;
       case 2:System.out.println("显示全部学生");
    	   break;
       case 3:System.out.println("退出程序");
           break;
       default:System.out.println("error");
       }
      
	}
}
