package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

 class Calc
{
int a,b,c,ch,res;	
	public Calc()
        {
		a=0;
		b=0;
		c=0;
		
	}
	
	public int menu()
        {
    	System.out.println("select option");
    	System.out.println("1.addition");
    	System.out.println("2.subtract");
    	System.out.println("3.multiply");
    	System.out.println("4.divide"); 
    	System.out.println("enter your choice");
    	Scanner s= new Scanner(System.in);
    	ch=s.nextInt();
    	return 0;
    	
	}
	
    public void userInputs()
    {
    Scanner s=new Scanner(System.in);	
   	System.out.println("enter first number");
    a=s.nextInt();
    System.out.println("enter second number");
    b= s.nextInt();
   
    }
   
public void  performOperation(){

	switch(ch)
	{
		case 1:System.out.println("addition");
		res=add();
		System.out.println(res);
		break;
		case 2:System.out.println("subtract");
		res=subtract();
		System.out.println(res);
		break;
		case 3:System.out.println("multiply");
		res=multiply();
		System.out.println(res);
		break;
		case 4:System.out.println("divide");
		res=divide();
		System.out.println(res);
		break;
		default:System.out.println("invalid choice");
	}
	
}
    	
    
       
    
    
	int add()
	{
	res=a+b;
	return res;
	}
	
	int subtract()
	{
	res=a-b;
	return res;
	}
	
	int multiply()
	{
	res= a*b;
	return res;
	}
	
	int divide()
	{
	res=a/b;
	return res;
	}

}

public class BasicCalc
{
	public static void main(String arg[])
	{
		Calc c=new Calc();
		c.menu();
		c. userInputs();
		c. performOperation();
	}
}