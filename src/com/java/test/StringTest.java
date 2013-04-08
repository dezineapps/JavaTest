/**
 * 
 */
package com.java.test;

import java.util.Calendar;

/**
 * @author jitendranath
 *
 */
public class StringTest {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strformate1 = String.format("%02d",1);
		String strformate2 = String.format("%03d",10);
		String strformate3 = String.format("%04d",100);
		String strformate4 = String.format("%05d",99);
		System.out.println("strformate1 = "+strformate1);
		System.out.println("strformate2 = "+strformate2);
		System.out.println("strformate3 = "+strformate3);
		System.out.println("strformate4 = "+strformate4);
		System.out.format("Local time: %tT", Calendar.getInstance());

	}

}
