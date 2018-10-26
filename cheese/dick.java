public class dick {

static int roomInBelly;
static int loopCount;

	public static void eatCheese(int bitesOfCheese) { //bitesOfCheese здесь является локальной переменной, не инициализированной?
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
eatCheese(roomInBelly = 5); //здесь мы вкидываем значение 5, которое прилипает к bitesOfCheese зачем-то

}
}