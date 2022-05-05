package Lista5_HERANCA_POLIMORFISMO;

public class cavalo extends animal {
	
	private boolean correr;

	public cavalo(String nome, int idade, boolean som, boolean correr) {
		super (nome, idade, som);
		this.correr = correr;
	}
	
	public void corre() {
		if (correr) {
			System.out.printf("\nEsse cavalo corre!");
		}
		else {
			System.out.printf("\nEsse cavalo n�o corre!");
		}
	}
	
	@Override
	public void emiteSom() {
		System.out.println("\nRiinnn in in");
	}
	
}
