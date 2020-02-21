package byteBank;

public class Conta {
	
	private int numero;
	private int agencia;
	private double saldo;
	private Cliente titular;
	
	void deposita(double valorDepositado) {
		this.saldo += valorDepositado;
	}
	boolean saca(double valorSaque){
		
		if(valorSaque <= this.saldo) {
			this.saldo -= valorSaque;
		return true;
		}else {
			return false;
		}	
	}
	public boolean transfere(double valorTransf,Conta destino){
		if(valorTransf >= 0 && destino != null) {
			this.saca(valorTransf);	
			destino.deposita(valorTransf);
			System.out.println("Transferencia Realizada!");
			return true;	
		}else {
			System.out.println("Transferencia Negada!");
			return false;
		}	
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}
