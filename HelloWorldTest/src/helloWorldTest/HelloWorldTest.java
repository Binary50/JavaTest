package helloWorldTest;

import java.util.Scanner;

public class HelloWorldTest {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		System.out.println("Fly a plane! Pick an option");
		System.out.println("a. Land");
		System.out.println("b. Takeoff");
		
		Scanner choice = new Scanner(System.in);
		String option = choice.next();
		System.out.println("You picked option "+option+"!");
		
		if (option.equalsIgnoreCase("a")) {
			System.out.println("You try to land, but you're going too steep! Goodbye silly.");
		} else if (option.equalsIgnoreCase("b")) {
			System.out.println("Congrats! Start the engines! Whoops, you clicked the fire extinguisher. All engines are blown out.");
		} else {
			System.out.println("I didn't quite understand you. Please try again.");
		}
		System.out.println("MISSION FAILED");
	}

}
