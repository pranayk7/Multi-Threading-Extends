
public class Digit extends Thread {
	public void run() {
		int digit = 1;
		for (int i=1; i<=5; i++) {
			System.out.println(digit++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
