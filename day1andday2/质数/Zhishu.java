public class Zhishu {
	public static void main(String[] args) {
     int i,j;
     for(i=2;i<=6;i++){
    	 for(j=2;j<=i/2;j++){
    		 if(i%j==0){
    			 break;
    		 }
    		 if(j>i/2)
    			 System.out.println(i+"������");
    	 } 
     }
}