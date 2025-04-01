package petshop.model;

import petshop.util.Cores;

public abstract class PetShop {
	private String titular;
	private int numero;
	private float data;
	private float hora;
	private float saldo;
	private boolean adotar;
	
	
	public PetShop(String titular, int numero, float data, float hora, float saldo) {
		this.titular = titular;
		this.numero = numero;
		this.data = data;
		this.hora = hora;
		this.saldo = saldo;
		this.adotar = adotar;
	}



	public String getTitular() {
		return titular;
	}






	public void setTitular(String titular) {
		this.titular = titular;
	}




	public int getNumero() {
		return numero;
	}






	public void setNumero(int numero) {
		this.numero = numero;
	}






	public float getData() {
		return data;
	}






	public void setData(float data) {
		this.data = data;
	}






	public float getHora() {
		return hora;
	}






	public void setHora(float hora) {
		this.hora = hora;
	}






	public float getSaldo() {
		return saldo;
	}






	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}






	public boolean isAdotar() {
		return adotar;
	}






	public void setAdotar(boolean adotar) {
		this.adotar = adotar;
	}

	
	
	public void depositar (float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}





	public void visualizar() {
	
		
		System.out.println(Cores.TEXT_GREEN_BOLD + 
				"\n\n***********************************************************" + Cores.TEXT_RESET);
		System.out.println("Dados da Conta:");
		System.out.println(Cores.TEXT_GREEN_BOLD + 
				"***********************************************************" + Cores.TEXT_RESET);
		System.out.println("Titular: " + this.titular);
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Data marcada: " + this.data);
		System.out.println("Hora marcada: " + this.hora);
		System.out.println("Saldo: " + this.saldo);
	}
	
}
