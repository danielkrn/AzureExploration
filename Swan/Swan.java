public class Swan {
 int numberEggs;// instance variable
 
public static void main(String[] args) {

System.out.println("Instance Variable Initialized");

Swan mother = new Swan();
System.out.println("Constructor created");

mother.numberEggs = 1; // set variable

System.out.println(mother.numberEggs); // read variable
System.out.println("Variable set"); // read variable

 }
}