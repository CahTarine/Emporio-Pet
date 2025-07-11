package petshop;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import petshop.controller.PetShopController;
import petshop.model.PetDomestico;
import petshop.model.PetSilvestre;
import petshop.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		PetShopController cadastros = new PetShopController();
		
		Scanner lerScanner = new Scanner(System.in);
		
		int opcao, porte, tipo;
		String titular, nomePet, animal;
		float data, hora, saldo;
		
		
		PetDomestico pd1 = new PetDomestico("bia", 124, 24.01f, 13.00f, 30, "julie", 1);
		pd1.visualizar();
		
		PetSilvestre ps1 = new PetSilvestre("cah", 125, 23.01f, 14.30f, 60, "coruja");
		ps1.visualizar();
		
		
		
		while (true) {
			
			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND + 
					"*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     EMPÓRIO PET                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     "); 
			System.out.println("            1 - Novo Cadastro                        ");
			System.out.println("            2 - Listar Cadastros                     ");
			System.out.println("            3 - Reservar Horário                     ");
			System.out.println("            4 - Cancelar Horário                     ");
			System.out.println("            5 - Créditos                             ");
			System.out.println("            6 - Loja                                 ");
			System.out.println("            7 - Adotar                               ");
			System.out.println("            8 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			try {
			opcao = lerScanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				lerScanner.nextLine();
				opcao = 0;
			}
			
			if (opcao == 8) {
				System.out.println(Cores.TEXT_GREEN + "Foi um prazer atende-lo, até a próxima!");
				sobre();
				lerScanner.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Novo Cadastro");
				
				/*System.out.println("Digite o nome do titular: ");
				lerScanner.skip("\\R?");
				titular = lerScanner.nextLine();
				
				System.out.println("data");
				data = lerScanner.nextFloat();
				
				System.out.println("hora");
				hora = lerScanner.nextFloat();
				
				
				
				do {
					System.out.println("tipo da conta");
					tipo = lerScanner.nextInt();
					
				} while ( tipo < 1 && tipo > 2);
				
				System.out.println("saldo");
				saldo=lerScanner.nextFloat();
				
				

				switch (tipo) {
					case 1 -> {
					
						System.out.println("porte");
						porte = lerScanner.nextInt();
						
						lerScanner.nextLine();
						System.out.println("nome pet");
						nomePet = lerScanner.nextLine();
						
						cadastros.cadastrar(new PetDomestico(titular, cadastros.gerarNumero(), data, hora, saldo, nomePet, porte));
						
					}
					
					case 2 -> {
						
						lerScanner.nextLine();

						System.out.println("animal");
						animal = lerScanner.nextLine();
						
						cadastros.cadastrar(new PetSilvestre(titular, cadastros.gerarNumero(), data, hora, saldo, animal));
						
					}
				}*/
				
				
				
				
				
				
				keyPress();
				break;
				
			case 2:
				System.out.println("Listar Cadastros");
				cadastros.listarTodos();
				
				keyPress();
				break;
				
			case 3:
				System.out.println("Reservar Horário");
				keyPress();
				
				break;
				
			case 4:
				System.out.println("Cancelar Horário");
				keyPress();
				
				break;
				
			case 5:
				System.out.println("Créditos");
				keyPress();
				
				break;
				
			case 6:
				System.out.println("Loja");
				keyPress();
				
				break;
				
			case 7:
				System.out.println("Adotar");
				keyPress();
				
				break;
				
			case 8:
				System.out.println("Sair");
				keyPress();
				break;
				
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "Opcao inválida" + Cores.TEXT_RESET);
					keyPress();
					
					break;
			}
		}
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Camille Tarine");
		System.out.println("Camille Tarine - camille.tarine.estagio@gmail.com");
		System.out.println("https://github.com/CahTarine");
		System.out.println("*********************************************************");
	}
	
	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\n Pressione Enter para continuar.");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter!");
		}
	}

}
