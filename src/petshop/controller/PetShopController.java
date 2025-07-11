package petshop.controller;

import java.util.ArrayList;
import petshop.model.PetShop;

import petshop.repository.PetShopRepository;

public class PetShopController implements PetShopRepository {
	
	private ArrayList<PetShop> listaCadastros = new  ArrayList<PetShop>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodos() {
		for (var cadastros : listaCadastros) {
			cadastros.visualizar();
		}
	}

	@Override
	public void reservarHorário() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelarHorario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adotar(int numero, String titular) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrar(PetShop cadastros) {
		listaCadastros.add(cadastros);
		System.out.println("\nA conta número "+ cadastros.getNumero() + " foi cadastrada com sucesso!");
	}

	
	public int gerarNumero() {
		return ++ numero;
	}
}
