package petshop.model;

public class PetDomestico extends PetShop {

	private int porte;
	private String nomePet;

	public PetDomestico(String titular, int numero, float data, float hora, float saldo, String nomePet, int porte) {
		super(titular, numero, data, hora, saldo);
		this.porte = porte;
		this.nomePet = nomePet;
		
	}

	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}
	
	
	public String getNomePet() {
		return nomePet;
	}
	
	public void setNomePet (String nomePet) {
		this.nomePet = nomePet;
	}
	
	@Override
	public void visualizar() {
		
		String porte = "";
		
		switch (this.porte) {
		case 1:
			porte = "pequeno";
			break;
			
		case 2:
			porte = "médio";
			break;
			
		case 3:
			porte = "grande";
			break;
		}
		
		super.visualizar();
		System.out.println("Nome do Pet: " + this.nomePet);
		System.out.println("Porte: " + porte);
	}
}
