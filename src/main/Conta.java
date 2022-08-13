package main;

public class Conta {
	
	private int numero;
	private float saldo;
	
	public Conta() {
		//DEFAULT CONSTRUCTOR
	}
	
	public Conta(int putNumero, float putSaldo) {
		this.numero = putNumero;
		this.saldo = putSaldo;
	}
		
	public int getNumero() {
		return numero;
	};
	
	public void setNumero(int putNumero) {
		this.numero = putNumero;
	};
	
	public float getSaldo() {
		return saldo;
	};
	
	public void setSaldo(float putSaldo) {
		this.saldo = putSaldo;
	};
	
	@Override
	public String toString() {
		return "Conta" + "\n" + "NUMERO: " + this.numero + "\n" + "SALDO: " + this.saldo;
	};
	
	public void debitaSaldo(float putDebito) {
		this.saldo = this.saldo - putDebito;
	};
	
	public void creditaSaldo(float putSaldo) {
		this.saldo = this.saldo + putSaldo;
	};
	

};
