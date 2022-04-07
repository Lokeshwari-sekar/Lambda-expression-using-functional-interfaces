package com.lambdaproject;

import java.util.ArrayList;

@FunctionalInterface
interface Drawable{
	//no argument and no return type
	void draw();
}

@FunctionalInterface
interface Sayable
{
	//one argument with no return type
	void say(String s);
}
@FunctionalInterface
interface sayableReturn
{
	//fuction with no argument and with return type
	String sayHello();
}
@FunctionalInterface
interface Addition
{
	int add(int a,int b);
}
@FunctionalInterface
interface Subtraction
{
	int sub(int x,int y);
}

public class LambdaProject
{

	public static void main(String[] args)
	{
		//no argument and no return type
		 Drawable ob=()->{
			 System.out.println("draw method body");
		 };
		 ob.draw();
		 
		 Runnable rob=()->{
			 System.out.println("run method body");
		 };
		 Thread tob=new Thread(rob);
		 tob.start();
		 
		//one argument with no return type
		 Sayable sob=(String s)->{//without data type also works
			System.out.println("hello "+s); 
		 };
        sob.say("keerthika");
        
      //fuction with no argument and with return type
        sayableReturn sr=()->{
        	return "Hello";
        };
        System.out.println(sr.sayHello());
        
        Addition aob=(i,j)->
        {
        	int s=i+j;
        	return s;
        	        
        };
       System.out.println(aob.add(5, 5));
        
       Subtraction stob=(a,b)->(a-b);
    	System.out.println(stob.sub(10, 5)); 
    	
    	
    ArrayList<Integer> arob=new  ArrayList<Integer> ();
    arob.add(10);
    arob.add(20);
    arob.add(30);
    
    arob.forEach((n)->System.out.println(n));
    
    
       
	}

}
