package curso.java.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		// thread processamento em paralelo do envio de email
		Thread threadEmail = new Thread(thread1) ;
		threadEmail.start();

		// *******************divisao das threads**********************
		
		
		
		// thread processamento em paralelo do envio de nota
		new Thread() {
			// executa o que queremos
			public void run() { 
				//codigo que vai executar em paralelo
				for(int pos = 0; pos < 5; pos++) {
					
					
					// executar esse envio com tempo de parada ou tempo determinado
					System.out.println("Executando algo rotina, exemplo nota fiscal");
					
					try {
						Thread.sleep(1000);// da 1 seg de execução
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
			
		}.start();// Star liga a thread que fica processando paralelamente por tras
		
		//Codigo continua
				System.out.println("Fim do teste de thread");
				JOptionPane.showMessageDialog(null, "Sistema continua executando");
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			//codigo que vai executar em paralelo
			for(int pos = 0; pos < 5; pos++) {
				
				
				// executar esse envio com tempo de parada ou tempo determinado
				System.out.println("Executando algo rotina, exemplo email");
				
				try {
					Thread.sleep(1000);// da 1 seg de execução
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
			
		}
	};

}
