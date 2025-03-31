package petshop.model;

public class NovoCadastro extends Cadastros {

	String nomePet;
	
	public NovoCadastro(String especie, int porte, int pelagem, String nomePet) {
		super(especie, porte, pelagem);
		this.nomePet = nomePet;
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Nome do Pet: " + nomePet);
	}
}
