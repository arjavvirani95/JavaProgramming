package practiceJava;

// What is the need of interface when abstraction can be achieved from abstract class?
// The solution to the diamond problem is default methods and interfaces.

// Java does not allow is multiple inheritance where one class can inherit properties from more than one class. It is known as the diamond problem.
// From java8 onwards we can write default and abstract method in interface


interface A { //first interface with test() default method
	public default void test() {
		System.out.println("we are in A");
	}
}

interface B { //second interface with test() default method
	public default void test() {
		System.out.println("We are in B");
	}
}

public class DiamondIssue implements A,B{ //implementing both interface, so here we are achieving multiple inheritance

	public void test() { // third test() method 
		System.out.println("this is from class public method");
		A.super.test(); // calling interface A method with super keyword
		B.super.test(); // calling interface B method with super keyword
	}
	
	public static void main(String[] args) {
		DiamondIssue obj = new DiamondIssue(); //Creating object of implemented class DiamondIssue
		obj.test(); // calling all three test() common method

	}

	

}
