
public class Conteggio implements Runnable{
	private int a;
	private int b;
	
	
	@Override
	public void run() {		
		
		
		while (a <= b) {
			System.out.println("Conteggio: " + a);
			a++;
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Errore durante la messa in pausa del Thread.");
				e.printStackTrace();
			}
		}
	}
	
}
