/**
 * 
 */
package challengeThreadingGameGuessTheTime;

import java.util.Scanner;

/**
 * @author - Daithi O hAnluain - 15621049
 */
public class StarterApp {
	
	public static final int GAME_LENGTH = 30;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Count of 30 secs game.");
		System.out.println("Press any key and enter to start .. then estimate when 30 secs have elapsed");
		
		sc.next();
		
		// run thread
		
		Timer t = new Timer();
		Thread t1 = new Thread(t);
		
		t1.start();
		
		System.out.println("Start counting... ");
		System.out.println("Hit any key when you think time is up");
		
		// stop thread
		
		sc.next();
		
		if (t.getCurrentCount() < GAME_LENGTH) {
			System.out.println("Too early : that was " + t.getCurrentCount() + " secs");
			System.out.println("Game over!");
		} else if (t.getCurrentCount() > GAME_LENGTH) {
			System.out.println("Too late : that was " + t.getCurrentCount() + " secs");
			System.out.println("Game over!");
		} else {
			System.out.println("Nice one you got it exactly right!");
			System.out.println("Game over!");
		}
	}

}
