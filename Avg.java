import java.util.*;
import java.lang.*;
import java.io.*;

class Avg
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner harshi=new Scanner(System.in);
		int t= harshi.nextInt();
		for(int i=0;i<t;i++){
		    int a=harshi.nextInt();
		    int b=harshi.nextInt();
		    int c=harshi.nextInt();
		    double f=(a+b);
		   
		    double g=f/2;
		   
		    if(g>c){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
