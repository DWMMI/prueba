package programmr_2_6;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport; 
/**
 * 
 * @author dichaowang
 *
 */
public class AbsoluteEquals_6 {
	
	 
	 public static void main(String args[]){ 
	 Scanner scanner=new Scanner(System.in); 
	boolean equal = false; 
	 
	 
	 System.out.println("Enter the 1st number:"); 
	 int num1=scanner.nextInt(); 
	System.out.println("Enter the 2nd number:"); 
	 int num2=scanner.nextInt(); 
	    ///{ write you code here 
	 
	 equal=Math.abs(num1)==Math.abs(num2);
	
	 

	    ///} 
	 
	  System.out.println("Result is:"+equal);  
	
	 
	} 

}
