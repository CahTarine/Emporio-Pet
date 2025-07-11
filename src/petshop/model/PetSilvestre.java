package petshop.model;

public class PetSilvestre extends PetShop {

	String animal;

	public PetSilvestre(String titular, int numero, float data, float hora, float saldo, String animal) {
		super(titular, numero, data, hora, saldo);
	this.animal = animal;
	
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Animal: " + this.animal);
	}
}
