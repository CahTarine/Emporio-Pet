package petshop.model;

import petshop.util.Cores;

public class PetShop {
	private String titular;
	private String cadastros;
	private String horarios;
	private float saldo;
	
	
	public PetShop(String titular) {
		this.titular = titular;
		this.cadastros = cadastros;
		this.horarios = horarios;
		this.saldo = saldo;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public String getCadastros() {
		return cadastros;
	}


	public void setCadastros(String cadastros) {
		this.cadastros = cadastros;
	}


	public String getHorarios() {
		return horarios;
	}


	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo()+valor);
	}
	
	public boolean comprar(float valor) {
		if (this.getSaldo() > 10) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Compra efetuada com sucesso. \nEspero que seu Pet goste!!");
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
			return false;
		}
	}
	
	public void visualizar() {
		if (getCadastros().isEmpty()) {
			System.out.println("Voce nao tem pets cadastrados!");
		} else {
			System.out.println(getCadastros());
		}
		
		if (getHorarios().isEmpty()) {
			System.out.println("Voce nao tem nenhum horário marcado atualmente.");
		} else {
			System.out.println(getHorarios());
		}
		
		System.out.println(Cores.TEXT_GREEN_BOLD + 
				"\n\n***********************************************************" + Cores.TEXT_RESET);
		System.out.println("Dados da Conta:");
		System.out.println(Cores.TEXT_GREEN_BOLD + 
				"***********************************************************" + Cores.TEXT_RESET);
		System.out.println("Titular: " + this.titular);
		System.out.println("Cadastros: " + this.cadastros);
		System.out.println("Horários Marcados: " + this.horarios);
		System.out.println("Saldo: " + this.saldo);
	}
	
}
