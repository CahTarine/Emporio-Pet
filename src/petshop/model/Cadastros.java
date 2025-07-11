package petshop.model;

public class Cadastros {
	private String especie;
	private int porte;
	private int pelagem;
	
	
	public Cadastros(String especie, int porte, int pelagem) {
		this.especie = especie;
		this.porte = porte;
		this.pelagem = pelagem;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public int getPorte() {
		return porte;
	}


	public void setPorte(int porte) {
		this.porte = porte;
	}


	public int getPelagem() {
		return pelagem;
	}


	public void setPelagem(int pelagem) {
		this.pelagem = pelagem;
	}
	
	
	public void visualizar() {
		String tamanho = "";
		
		switch (this.porte) {
		case 1:
			tamanho = "pequeno";
			break;
			
		case 2:
			tamanho = "médio";
			break;
			
		case 3:
			tamanho = "grande";
			break;
		}
		
		String pelo = "";
		
		switch (this.pelagem) {
		case 1:
			pelo = "curto";
			break;
			
		case 2: 
			pelo = "longo";
			break;
		}
		
		System.out.println("Espécie: " + this.getEspecie());
		System.out.println("Porte: " + tamanho);
		System.out.println("Pelagem: " + pelo);
	}
	
}
