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
       System.out.println("|1.����һ��ѧ��|");
      System.out.println("|2.��ʾȫ��ѧ��|");
      System.out.println("|3.�˳�����|");
       int choice=in.nextInt();
       switch (choice){
       case 1:System.out.println("����һ��ѧ��"); 
           break;
       case 2:System.out.println("��ʾȫ��ѧ��");
    	   break;
       case 3:System.out.println("�˳�����");
           break;
       default:System.out.println("error");
       }
      
	}
}
