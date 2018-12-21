

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		// ==========
		
		// Numbers
		int Number = 3;
		int Value;
		Value = 2;
		Value = Number;
		double digits = 2.5;
		short digit = 1;
		
		
		// Strings
		char letter = 'a';
		String name = "yoni";
		String newName = name;
		
		// Boolean
		boolean isTrue = true;
		boolean isFalse = false;
		isTrue = isFalse;
		
		// Arrays
		String[] names = {"yoni", "Amit", "Avi"};
		names[0] = "Yoni";
		names[0] = null;
		char[] letters = {'h', 'e', 'l', 'l', 'o'};
		
		// IO
		System.out.println(names[1]);
		System.out.println(digits);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an integer");
		int myint = keyboard.nextInt();
		System.out.println(myint);
		
		final int constant = 3;
		
		
		// Operators
		// =========
		
		// Numbers
		int first = 2;
		int second = 3;
		int sum = first + second;
		
		int sumAgain = 0;
		double aDouble = 3.4;
		// sumAgain = aDouble + first; // Can't do that
		
		int div = second / first;
		int mod = second % first;
		int multi = second * first;
		int sub = second - first;
		
		second++;
		first--;
		second += Value;
		
		// Strings
		String hello = "hello";
		String Goodbye = "Goodbye";
		String helloGoodbye = hello + Goodbye;
		helloGoodbye += " and happy birthday";
		
		// Conditions
		// ==========
		
		int smallNum = 0;
		int bigNum = 30;
		
		if (smallNum < bigNum)
		{
			System.out.println(smallNum + " is smaller");
		}
		else
		{
			System.out.println((smallNum + " is not smaller"));
		}
		
		
		
	}

}
