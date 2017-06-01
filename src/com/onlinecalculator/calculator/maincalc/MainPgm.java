package com.onlinecalculator.calculator.maincalc;

import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.*;

public class MainPgm {
public static void main(String args[]){
        int type;
        type=disply();
        if(type==1)
        {
        	BasicCalc c=new BasicCalc();
        	c.menu();
        	c. userInputs();
        	c. performOperation();
        }
        if(type==2)
        {
        	ScientificCalc scalc=new ScientificCalc();
    		scalc.menu();
    		scalc.userInputs();
    		scalc.performOperation();
       	}
        	
        	if(type==3)
        	{
        		StatisticCalc scalc=new   StatisticCalc();
      		  scalc.menu();
      		  scalc. userInputs();
      		  scalc. performOperation();
        	}
 
    }
        
    static int disply()
    {
    	int ch;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("******** caliculator*******");
    	System.out.println("********1.basic caliculator*******");
    	System.out.println("********2.scientific caliculator*******");
    	System.out.println("********3.static caliculator*******");
    	System.out.println("************************************");
    	System.out.println("enter your choice");
    	ch=sc.nextInt();
    	return(ch);
    }
    	
    	
    	
    	 }
