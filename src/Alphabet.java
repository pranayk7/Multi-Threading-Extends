
public class Alphabet extends Thread {
	public void run() {
		char alphabet = 'a';
		for (int i=1; i<=5; i++) {
			System.out.println(alphabet++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
