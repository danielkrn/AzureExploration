//DEMO for sequence of initialization

public class Egg { 
 public Egg() {								// 6. Now the constructor runs.
 number = 5;								// 7. It sets number to 5
 }
 public static void main(String[] args) { 	// 1. Code starts executing here
 Egg egg = new Egg(); 						// 2. Constructor is called, but not yet works.
 System.out.println(egg.number); 			// 8. It prints the latest set value of number.
 }							
 private int number = 3; 					// 4. This is a field! It runs. 
 { number = 4; } } 							// 5. This is an instance initializer! It runs too... 