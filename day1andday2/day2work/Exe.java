package com.geminno.demo;

public class Exe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][]grade=new int[20][5];
    for (int j = 0;j < 5; j++)
    {
   	for (int i = 0 ;i < 20; i++){
		grade[i][j] = (int) (Math.random() * 100);
	  
    		System.out.print(grade[i][j]+"\t");
	     if (i==4){System.out.print("\n");}
	     if (i==9){System.out.print("\n");}
	     if (i==14){System.out.print("\n");}
	     if (i==19){System.out.print("\n");}
    	}
    	
    
   }
   	int[] sum=new int[20];
   	for(int k=0;k<20;k++)
   		{sum[k]=grade[k][0]+grade[k][1]+grade[k][2]+grade[k][3]+grade[k][4];
   	    System.out.print(sum[k]+"\t");}
   	int[] average=new int[5];
   	System.out.print("\n");
   	for(int m=0;m<5;m++)
   			{average[m]=grade[0][m]+grade[1][m]+grade[2][m]+grade[3][m]+grade[4][m]+grade[5][m]+grade[6][m]+grade[7][m]+grade[8][m]+grade[9][m]+grade[10][m]+grade[11][m]+grade[12][m]+grade[13][m]+grade[14][m]+grade[15][m]+grade[16][m]+grade[17][m]+grade[18][m]+grade[19][m];
   	         average[m]=average[m]/5;
   	System.out.print(average[m]+"\t");}
	}
	
	}

