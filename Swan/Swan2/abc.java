public class abc {

String first;
String last;
String full;

public static void main(String[] args) {
	abc quack = new abc();

		quack.first = "Theodore ";
		quack.last = "Moose";
		quack.full = quack.first + quack.last;

{ System.out.println(quack.full); } // read variable in instance initializer 

}
}