package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

import java.lang.Math;

public class ScientificCalc extends BasicCalc{
	public int menu(){
		System.out.println("select option");
    	System.out.println("1.addition");
    	System.out.println("2.subtract");
    	System.out.println("3.multiply");
    	System.out.println("4.divide"); 
    	System.out.println("5.powerof");
    	System.out.println("6.squrareroot");
    	System.out.println("7.sinefunction of degree");
    	System.out.println("enter choice");
    	Scanner sc=new Scanner(System.in);
    	int ch=sc.nextInt();
    	return(ch);
  	
	}

  public void userInputs()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter first number");
	 int a=sc.nextInt();
	 
	  if(ch!=6&&ch!=7){
		  System.out.println("enter second number");
		 int b=sc.nextInt();
	  }
		  
  	
  }

  public void performOperation(){ 
	  
  		switch(ch)
  		{
  		case 1:
  		case 2:
  		case 3:
  		case 4:
  		super.performOperation();
  		break;
  		case 5:
  			System.out.println(pwrof());
    	break;
  		case 6:
  			System.out.println(sqrtof());
  			break;
  		case 7:
  			System.out.println(sineof());
  			break;
  		default:System.out.println("wrong choice");
  		break;
  		
  	}
      
  }
  
	double pwrof()
	{
		System.out.println("power");
		return(Math.pow(a,b));
	}				
	
	double sqrtof()
	{
		return(Math.sqrt(a));	
	}

	double sineof()
	{
	double  rad= Math.toRadians(a);
	return(Math.sin(rad));	
	}
}