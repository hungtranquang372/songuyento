package bai1;

import java.util.Scanner;

public class HelloWorld {
//
//	public static void main(String[] args) {
//		double amount = 25.78;
//	    int remainingAmount = (int)(amount * 100);
//	    
//	    
//	    int numberOneDollar=remainingAmount/100;
//	    remainingAmount = remainingAmount % 100;
//	    
//	    
//	    int numberOfQuarter =remainingAmount/25;
//	    remainingAmount = remainingAmount % 25; 
//	    
//	    
//	    
//	    int numberOfDimes = remainingAmount/10;
//	    remainingAmount = remainingAmount % 10;
//	    
//	    
//	    int numberOfNickles = remainingAmount/5;
//	    remainingAmount = remainingAmount % 5;
//	System.out.println("numberOneDollar = "  + numberOneDollar );
//	System.out.println(" numberOfQuarter= "  +numberOfQuarter  );
//	System.out.println(" numberOfDimes = "  + numberOfDimes  );
//	System.out.println(" numberOfNickles= "  + numberOfNickles);
//	
//
//}}
//	    
//	    
	    
	   public static void main(String[] args) {
		   int n;
		   Scanner input = new Scanner(System.in);
		   System.out.println("input n :");
		   n = input.nextInt();
		   if(n>0){
			   if (ktrsonguyento(n)==1)
				   System.out.println(n + "so nguyen to");
			   else 
				   System.out.println(n +"ko phai so nguyen to");
			   
				
			}
					   
		   }
		private static int ktrsonguyento(int n) {
			int dem = 0;
			for (int i = 1; i <=n; i++) {
				if(n%i==0)
					dem++;
				
			}
			    if (dem ==2)
			    	return 1;
			    else return 0;
			    
					
				}
			
		} 
		   
	   
		
	
	   
	    
		
		
	    
		
	
