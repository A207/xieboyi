package com.geminno.demo;

import java.util.Scanner;

public class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    int day=scanner.nextInt();
	String monthString="";
	switch(day){
	case 1:monthString="monday";break;
	case 2:monthString="tuesday";break;
	case 3:monthString="wednesday";break;
	case 4:monthString="thursday";break;
	case 5:monthString="firday";break;
	case 6:monthString="saturday";break;
	case 7:monthString="sunday";break;
	default:monthString="error day";
	
	}
	System.out.println(monthString);
	}

}
