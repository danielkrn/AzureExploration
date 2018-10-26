public class dickTwo {

static int roomInBelly = 5;
static int loopCount;
static int bitesOfCheese = 5;

	public static void eatCheese() {
		System.out.println("Start of the loop. bitesOfCheese = "+bitesOfCheese);

		while (bitesOfCheese > 0 && roomInBelly > 0) { 		
			loopCount++;
				System.out.println("This is loop "+loopCount+".");
			bitesOfCheese--; 			
				System.out.println("bitesOfCheese = "+bitesOfCheese);
					
			roomInBelly--; 
				System.out.println("roomInBelly = "+roomInBelly);
			}
	System.out.println(bitesOfCheese+" pieces of cheese left. THE END"); 
	}

public static void main(String[] args) {
eatCheese();

}
}