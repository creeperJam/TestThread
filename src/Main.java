import java.lang.Thread;

public class Main{
	
	public static void main (String[] args) {
		Input in = new Input();
		
		System.out.println("Dati per eseguire il countdown.");
		int val = in.inputInt("Inserire tempo countdown:", 1);
		System.out.println("Countdown da " + val + " a 0.\n");
		
		
		int a = in.inputInt("Inserire il valore minimo del conteggio:");
		int b = in.inputInt("Inserire il valore massimo del conteggio:", a + 1);
		
		
		
		Thread countdown = new Thread(new Countdown(val));
		Thread conteggio = new Thread(new Conteggio());
		
		System.out.println("Thread 1: Countdown\nThread 2: Conteggio\n");
		
		countdown.start();
		conteggio.start();
	}
}
