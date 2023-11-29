package java_task;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 double ferenheight;
		 double celcious;
		//System.out.println("enter ur choice");
		 for(;;)
		 {
		System.out.println("1. ferenheit 2.celcius 3.stop");
		int input=sc.nextInt();
		switch(input)
		{
		case 1:System.out.println("enter ferenheight to convert into celcious");
		int F=sc.nextInt();
		
		celcious=((F-32)*5)/9;
		System.out.println(celcious);
		break;
		case 2:System.out.println("enter celcious to convert into ferenheight");
		int C=sc.nextInt();
		
		ferenheight=((C*9)/5)+32;
		System.out.println(ferenheight);
		break;
		case 3:System.exit(0);
		default:
			System.out.println("invalid choice");
		}
		
		 }
	}

}
