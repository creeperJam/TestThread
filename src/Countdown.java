
public class Countdown implements Runnable {
	private int val;
	
	public Countdown(int val) {
		this.val = val;
	}
	
	@Override
	public void run() {		
		while (val > 0) {
			System.out.println("Tempo rimanente: " + val);
			val--;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Errore durante la messa in pausa del Thread.");
				e.printStackTrace();
			}
		}
		System.out.println("Countdown arrivato a 0.");
	}

}
