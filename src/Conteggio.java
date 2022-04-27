
public class Conteggio implements Runnable{
	private int a;
	private int b;
	
	
	public Conteggio(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		int val = a;
		while (val <= b) {
			System.out.println("Conteggio: " + val);
			val++;
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Errore durante la messa in pausa del Thread.");
				e.printStackTrace();
			}
		}
		
		System.out.println("Fine stampa dei valori tra " + a + " e " + b + ", compresi.");
	}
	
}
