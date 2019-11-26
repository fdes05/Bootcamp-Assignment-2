import java.util.Random;
import java.util.Scanner;

public class RunnableClass {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int currentRandom = random.nextInt(100) + 1;
		System.out.println("random number " + currentRandom);
		
		
		int currentAtt = 1;
				
		while (currentAtt <= 5) {
						
			int answer = 1;
			
			System.out.println("Type a number between 1 and 100");
			answer = Integer.parseInt(scanner.nextLine());			
			
			while (answer < 1 || answer > 100) {
				System.out.println("The number you typed is not between 1 and 100! Try again!");
				answer = Integer.parseInt(scanner.nextLine());	
			}
						
			if (answer == currentRandom) {
				System.out.println("Great, You've won!");
				currentAtt = 7;
			}
			else if (answer > currentRandom){
				System.out.println("Please pick a lower number");
				currentAtt++;
			}
			else if (answer < currentRandom){
				System.out.println("Please pick a higher number");
				currentAtt++;
			}
			else {
				System.out.println("You're screwed! Learn OOP, dummy.... lol");
			}
		}
			if (currentAtt == 6) {
				System.out.println("You've lost!");
			}
	}

	
	
}


