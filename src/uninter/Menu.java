package uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;  //Classe para obter dados do usuário
	private Cofrinho cofre;
	
	public Menu() {
		sc = new Scanner(System.in); //Instanciação da classe Scanner
		cofre = new Cofrinho(); //Instanciação da classe Cofrinho 
	}

	public void mostrarMenuPrincipal() { // //Exibindo o menu principal com todas as opções 
		System.out.println("COFRINHO DE MOEDAS | Matias Correa");
		System.out.println("1-Adicionar moeda");
		System.out.println("2-Remover moeda");
		System.out.println("3-Listar moedas");
		System.out.println("4-Calcular valor total convertido para real");
		System.out.println("0-Encerrar");
		System.out.print("Digite a opção pretendida: ");
		
		String opcao = sc.next(); //Função que permite digitar e guardar um resultado 
		
		System.out.println();
		
		switch (opcao) { 
			
		case "1": // Opção responsável por adicionar moedas dentro do cofrinho
			System.out.println("Escolha Moeda:");
			System.out.println("1-Real:");
			System.out.println("2-Dólar:");
			System.out.println("3-Euro:");
		
			int escolhaMoeda = sc.nextInt(); //Método para obter o valor inserido pelo usuário.
		
			System.out.println("Digite o valor:");
		
			String valorMoedaTextual = sc.next();
			valorMoedaTextual = valorMoedaTextual.replace(",", "."); //Função para fazer a conversão de formatação (Substituindo a vírgula por um ponto)
			double valorMoeda = Double.parseDouble(valorMoedaTextual); //Transformar a String em double
			
			Moeda moeda = null; //Inicializar a variável como nula
		
			if (escolhaMoeda == 1) {
				moeda = new Real(valorMoeda);
			} else if(escolhaMoeda == 2) {
				moeda = new Dolar(valorMoeda);
			} else if(escolhaMoeda == 3) {
				moeda = new Euro(valorMoeda);
			} else {
				System.out.println("Opção de moeda inválida!!");
				mostrarMenuPrincipal();
			}
		
			cofre.adicionar(moeda); //Após a instância do objeto, é chamado o método de Adicionar Moeda
			System.out.println("Moeda registrada com sucesso!");	

			mostrarMenuPrincipal();
			break;
	
		case "2": // Opção responsável por remover moedas dentro do cofrinho
			System.out.println("Escolha Moeda:");
			System.out.println("1-Real:");
			System.out.println("2-Dólar:");
			System.out.println("3-Euro:");
		
			int escolhaMoeda1 = sc.nextInt();
		
			System.out.println("Digite o valor a ser removido:");
		
			String valorMoedaTextual1 = sc.next();
		
			valorMoedaTextual1 = valorMoedaTextual1.replace(",", ".");
			double valorMoeda1 = Double.parseDouble(valorMoedaTextual1);
		
			Moeda moeda1 = null;
		
			if (escolhaMoeda1 == 1) {
				moeda1 = new Real(valorMoeda1);
			} else if(escolhaMoeda1 == 2) {
				moeda1 = new Dolar(valorMoeda1);
			} else if(escolhaMoeda1 == 3) {
				moeda1 = new Euro(valorMoeda1);
			} else {
				System.out.println("Opção de moeda inválida!");
				mostrarMenuPrincipal();
			}
		
			boolean moedaRemovida = cofre.remover(moeda1); //Após a instância do objeto, é chamado o método de Remover Moeda
		
			if(moedaRemovida) {
				System.out.println("Moeda removida com sucesso!");
			} else {
				System.out.println("Não foi encontrada nenhuma moeda com esse valor!");
			}
			
			mostrarMenuPrincipal();
			break;
			
		case "3": // Opção responsável por mostrar as moedas guardadas no cofrinho
			cofre.listagemMoedas();
			mostrarMenuPrincipal();
			break;
			
		case "4": // Opção responsável por mostrar a conversão das moedas ao usuário
			double totalValorConvertido = cofre.totalConvertido();
			String totalValorConvertidoTextual = String.format("%.2f", totalValorConvertido); //Função para formatar o valor com duas casas decimais após a virgula
			totalValorConvertidoTextual = totalValorConvertidoTextual.replace(".",",");
			System.out.println("O valor total convertido para real ?" + totalValorConvertidoTextual);
			mostrarMenuPrincipal();
			break;
			
		case "0": //Opção responsável por finalizar o programa
			System.out.println("Sistema finalizado!");
			break;
			
		default: //Função caso o usuário digite uma opção não existente
			System.out.println("Opção não reconhecida.");
			mostrarMenuPrincipal();
			break;
		}
	}	
}
