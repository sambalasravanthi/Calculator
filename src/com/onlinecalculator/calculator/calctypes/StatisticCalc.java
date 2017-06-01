package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;
import java.lang.Math;
public class StatisticCalc extends BasicCalc{
	double no_array[];
	public int menu()
	{
		System.out.println("select option");
    	System.out.println("1.addition");
    	System.out.println("2.subtract");
    	System.out.println("3.multiply");
    	System.out.println("4.divide"); 
    	System.out.println("5.mean");
    	System.out.println("6.median");
    	System.out.println("7.mode");
    	System.out.println("8.Math.sqrt(mode");
    	System.out.println("9.bye");
    	System.out.println("enter your choice");
    	Scanner sc=new Scanner(System.in);
    	 ch=sc.nextInt();
    	return(ch);
	}

    public void userInputs()
    {
    	
    Scanner sc=new Scanner(System.in);
    	if(ch>=5&&ch<=8){
    		System.out.println("enter the total number ofvalues");
    		int len =sc.nextInt();
    		no_array=new double[len];
    		for(int i=0; i<no_array.length;i++)
    		{
    			System.out.println("enter data");	
    			no_array[i]=sc.nextInt();
    		}
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
      			System.out.println(mean());
        	break;
      		case 6:
      			System.out.println(median());
      			break;
      		case 7:
      			System.out.println(mode());
      			break;
      		case 8:System.out.println(Math.sqrt(mode()));
      		break;
      		case 9:	System.out.println("bye");
      		System.exit(0);
      		break;
      		default:System.out.println("wrong choice");
      		System.out.println("/n......../n");
      	}
    	}
       
    
    
	double mean()
	{
		double sum=0;
		for(int i=0; i<no_array.length;i++)
		{
			sum+= no_array[i];
		}
		double meanvalue=sum/no_array.length;
		return(meanvalue);
		}
	
	
	double median()
	{
	int middle=	no_array.length/2;
	if(no_array.length/2==1){
		double medianValue=no_array[middle];
		return( medianValue);
	}
	else
	{
		double medianValue=(no_array[middle-1]+no_array[middle])/2.0;
		return(medianValue);
	}
	}
	double mode()
	{
		double modeValue=no_array[0];
		int maxCount=0;
		for(int i=0;i<=no_array.length;i++) 
		{
			double Value=no_array[i];
			int Count=1;
			for(int j=0;j<no_array.length;j++) {
				if(no_array[j]==Value)
			Count++;
				if(Count>maxCount)
				{
				modeValue=Value;
				maxCount=Count;
				}
			}
		}
	
			return modeValue;	
	}
}	
		
	
 