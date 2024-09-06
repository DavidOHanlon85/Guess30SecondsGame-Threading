/**
 * 
 */
package challengeThreadingGameGuessTheTime;

/**
 *  @author - Daithi O hAnluain - 15621049
 */
public class Timer implements Runnable {

	private int currentCount;
	
	@Override
	public void run() {
		
		currentCount = 0;
		
		try {
			do {
				Thread.sleep(1000);
				currentCount++;
			} while (currentCount < StarterApp.GAME_LENGTH*2);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @return the currentCount
	 */
	public int getCurrentCount() {
		return currentCount;
	}
	
	

}
