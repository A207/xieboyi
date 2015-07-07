package com.geminno.demo;

public class Demo03 {
     int intday;
	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub
    public enum day{monday,tuesday,wednesday,thurday,firday,saturday,sunday}
    
    public static void main(String[] args) {
    int intDay=0;
    	    
    day day1=day.wednesday;
    switch(day1){
    case monday:intDay=1;break;
	case firday:intDay=5;
		break;
	case saturday:intDay=6;
		break;
	case sunday:intDay=7;
		break;
	case thurday:intDay=4;
		break;
	case tuesday:intDay=2;
		break;
	case wednesday:intDay=3;
		break;
    }
    System.out.println(intDay);
    	
}
    }