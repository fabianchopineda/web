package logica;

public class Hilo implements Runnable  {
		
	private Thread hiloTal;
	
	private boolean control;
	private boolean pausa;
	private long tiempo;
	
	
	public Hilo() {
		
		hiloTal = new Thread(this);
		control = true;
		tiempo = 1000;		
	}

	
	public void run() {
		while (control){
			System.out.println("ya esta corriendo");
			
			try {
				Thread.sleep(tiempo);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}	
	public void detener(){
		while (pausa){
			System.out.println("se detuvo");
			
		}
	}
	
	
	public static void main (String [] entro){
		Hilo h = new Hilo();
		h.run();
	}
}
