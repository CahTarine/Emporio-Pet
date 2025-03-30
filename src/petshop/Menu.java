package petshop;

import java.util.Scanner;
import petshop.model.PetShop;
import petshop.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			
			PetShop conta1 = new PetShop("Ana");
			
			conta1.setTitular("Camille");
			
			conta1.setCadastros("julie");
			conta1.setHorarios("03/04 - 14:30");
			conta1.depositar(30);
			conta1.comprar(20);
			conta1.visualizar();
			
			
			
			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND + 
					"*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     EMPÓRIO PET                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     "); 
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Novo Cadastro                        ");
			System.out.println("            3 - Listar Cadastros                     ");
			System.out.println("            4 - Reservar Horário                     ");
			System.out.println("            5 - Cancelar Horário                     ");
			System.out.println("            6 - Créditos                             ");
			System.out.println("            7 - Loja                                 ");
			System.out.println("            8 - Adotar                               ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao = lerScanner.nextInt();
			
			if (opcao == 9) {
				System.out.println(Cores.TEXT_GREEN + "Foi um prazer atende-lo, até a próxima!");
				sobre();
				lerScanner.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Criar conta");
				break;
				
			case 2:
				System.out.println("Novo Cadastro");
				break;
				
			case 3:
				System.out.println("Listar Cadastros");
				break;
				
			case 4:
				System.out.println("Reservar Horário");
				break;
				
			case 5:
				System.out.println("Cancelar Horário");
				break;
				
			case 6:
				System.out.println("Créditos");
				break;
				
			case 7:
				System.out.println("Loja");
				break;
				
			case 8:
				System.out.println("Adotar");
				break;
				
				default:
					System.out.println("Opcao inválida");
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

}
