import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter num till you want fibonnaci: ");
		int num = sc.nextInt();
		System.out.println("fibonnaci number at is: "+function(num));
	}	
	                
	 public static int function(int num){
	     if(num==0){
	         return 0;
	     }
	     if(num==1){
	         return 1;
	     }
	     else{
	         return function(num-1)+function(num-2);
	     }
	 }
	    
	
}
