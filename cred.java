import java.util.*;
import java.lang.*;
import java.io.*;

class Cred
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner read=new Scanner(System.in);
		int a=read.nextInt();
		for(int i=0;i<a;i++){
		    int b=read.nextInt();
		    int c=read.nextInt();
		    if(b*c >=100){
		        int n=(b*c)-((b*c)%100);
		        int num=n/100;
		        System.out.println(num);
		    }
		    else{
		        System.out.println("0");
		    }
		}
		
		

	}
}
