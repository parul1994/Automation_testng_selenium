package inheritance_pract;

import java.util.Scanner;

public class duplicate_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		 //String size = sc.nextLine();
		String s=sc.nextLine();
		//String[] s = new String [sc.nextInt()];      
		    int distinct = 0 ;
		    int j,i;
	       // char arr[] = s.toCharArray();   

		    for ( i = 0; i < s.length(); i++) {
		    	

		        for ( j = 0; j < i; j++) {
		        	

		            if(s.charAt(i)==s.charAt(j))
		            {
		            	//System.out.println("Duplicate strings are: "+s.charAt(j));	
		            	 distinct++;

		            }
		           
		        }
		      
		        
		        System.out.println(s.charAt(i)+"--"+distinct);
		        String d=String.valueOf(s.charAt(i)).trim();
		        s=s.replaceAll(d,"");
		        distinct = 0;

	}
	}

}
