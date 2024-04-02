package molero.german;

public class Main {
//Esto es un comentario para commitear
	public static void main(String[] args) {
		CuentaCorriente c1 = new CuentaCorriente("Gerarg", 25200.95);
		CuentaCorriente c2 = new CuentaCorriente("Caro", 10000.95);
		System.out.println(c1.getDatosCuenta());
		System.out.println(c1.getSaldo());
		c1.setTransferencia(c1, c2, 10000);
		System.out.println(c1.getSaldo()); 
		System.out.println(c2.getSaldo());
	}
}
