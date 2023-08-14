package uninter;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas; //Criação de um espaço para armazenar a lista de moedas
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>(); //Inicializar com a lista de moedas vázia 
	}
	
	public void adicionar(Moeda moeda) { 
		this.listaMoedas.add(moeda); //Criação do método Adicionar
	}
	
	public boolean remover(Moeda moeda) {
		return this.listaMoedas.remove(moeda); //Criação do método Remover
	}

	public void listagemMoedas() {
		
		if (this.listaMoedas.isEmpty()) { //Método para verificar se a lista está vazia
			System.out.println("O cofrinho está vazio!");
			return;
		}
		
		//Criação do método de listar moedas
		for(Moeda moeda : this.listaMoedas ) {
			moeda.info();
		}
	}

	//Criação da opção de mostrar todos os valores convertidos em reais
	public double totalConvertido() {
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		
		double quantidadeSomada = 0; //Inicializar o valor com 0
		
		// Criação de um loop 
		for(Moeda moeda : this.listaMoedas ) {
			quantidadeSomada = quantidadeSomada + moeda.converter(); //Pegar o valor da quantidade e somar com o converter da moeda
		}
		
		return quantidadeSomada;
	}
}
