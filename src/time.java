
public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int passwordLength = 36;
				int alphabetSize = 7;
				double timePerPassword = 3;
				final int SECONDS_PER_DAY = 86400;
				double totalTime = Math.pow(alphabetSize, passwordLength) * timePerPassword / SECONDS_PER_DAY;
				System.out.println(totalTime);
			}
		
	}


