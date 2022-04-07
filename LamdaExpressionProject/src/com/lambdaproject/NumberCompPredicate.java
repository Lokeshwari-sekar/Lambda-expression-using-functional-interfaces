package com.lambdaproject;

import java.util.function.Predicate;

public class NumberCompPredicate {

	public static void main(String[] args) {
		Predicate<Integer> gt=(i)->i>10;
        //System.out.println(gt.test(15));
        boolean b=gt.test(25);
        if(b)
        {
        	System.out.println("greater than 10");
        }
        else
        {
        	System.out.println("lesser  than 10");
        }
	}

}
