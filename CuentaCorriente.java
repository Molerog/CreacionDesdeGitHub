package molero.german.cuentaCorriente;

public class CuentaCorriente {
	private String nombre;
	private double saldo;
	private long numeroCuentaCorriente;
	
	public CuentaCorriente(String nombre, double saldo) {
		this.nombre=nombre;
		this.saldo=saldo;
		numeroCuentaCorriente =(long)(Math.floor(Math.random()*(100000-10000+1)+1));
	}
	
	public void setIngreso(double saldo) {
		if(saldo<0) System.out.println("No puedes ingresar una cantidad inferior a 0"); 
		else this.saldo += saldo;
	}
	
	public void setSacarDinero(double saldo) {
		
		if(saldo > this.saldo) System.out.println("No tienes suficiente dinero, estás intentando sacar " 
		+ (saldo - this.saldo) +" de más");		
		else 
			System.out.println(this.saldo);
			this.saldo -= saldo;
	}
	
	public String getSaldo() {
		return "El saldo es de " + saldo;
	}
	
	public void setTransferencia(CuentaCorriente c1, CuentaCorriente c2, double saldo) {
		c1.setSacarDinero(saldo);
		c2.setIngreso(saldo);
	}
	
	
	public String getDatosCuenta() {
		return "El nombre del titular es " + nombre + ". \nCuenta con un saldo de " + saldo + 
				"\nEl número de la cuenta corriente es "+ numeroCuentaCorriente;
	}
}
