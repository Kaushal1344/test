

import java.util.Scanner;

import java.util.*;

public class Week02 {

	public static void main(String[] args) {

Scanner obj = new Scanner(System.in);
System.out.println("Enter the first number:");
double num1 = obj.nextInt();
System.out.println("Enter the second number:");
double num2 = obj.nextInt();
double z = num1 + num2;
double x = num1- num2;
double w = num1/num2;
obj.close();
System.out.println("The addition of  the two numbers is "+z);
System.out.println("The subtraction  of  the two numbers is "+x);
System.out.println("The division of these two numbers is "+w);

	}

}
