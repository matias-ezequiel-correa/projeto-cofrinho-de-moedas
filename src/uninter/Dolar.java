package uninter;

public class Dolar extends Moeda { //Declarando que Dolar é filha de Moeda
	
	//Método construtor do valor da moeda
	public Dolar(double valor) {
		this.valor = valor;
	}

	@Override //Método para exibir a informação da moeda
	public void info() {
		System.out.println("Dólar- " + valor);	
	}

	@Override //Método para retornar o valor convertido para real
	public double converter() {
		return this.valor * 4.9;
	}
	
	@Override //Método para comparar
	public boolean equals(Object unidade) {
		if (this.getClass() != unidade.getClass()) {
			return false;
		}
		
		Dolar unidadeDolar = (Dolar) unidade;
		
		if (this.valor != unidadeDolar.valor) {
			return false;
		}
		return true;
	}
}
