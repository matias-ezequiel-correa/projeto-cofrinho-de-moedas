package uninter;

public class Euro extends Moeda { //Declarando que Euro é filha de Moeda
	
	//Método construtor do valor da moeda
	public Euro(double valor) {
		this.valor = valor;
	}

	@Override //Método para exibir a informação da moeda
	public void info() {
		System.out.println("Euro- " + valor);
	}

	@Override //Método para retornar o valor convertido para real
	public double converter() {
		return this.valor * 5.4;
	}
	
	@Override //Método para comparar
	public boolean equals(Object unidade) {
		if (this.getClass() != unidade.getClass()) {
			return false;
		}
		
		Euro unidadeEuro = (Euro) unidade;
		
		if (this.valor != unidadeEuro.valor) {
			return false;
		}
		return true;
	}
}
