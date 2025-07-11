package petshop.repository;

import petshop.model.PetShop;

public interface PetShopRepository {
	//CRUD do Pet Shop
	public void procurarPorNumero(int numero);
	public void listarTodos();
	public void cadastrar(PetShop cadastros);
	public void reservarHorário();
	public void cancelarHorario();
	
	// Métodos Especiais;
	public void depositar(int numero, float valor);
	public void adotar(int numero, String titular);
}
