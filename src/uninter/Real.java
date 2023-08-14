package uninter;

public class Real extends Moeda {  //Declarando que Real é filha de Moeda

	//Método construtor do valor da moeda
	public Real(double valor) {
		this.valor = valor;
	}
	
	@Override //Método para exibir a informação da moeda
	public void info() { 
		System.out.println("Real- " + valor);
	}

	@Override //Método para retornar o valor convertido para real
	public double converter() {
		return this.valor;
	}
	
	@Override //Método para comparar
	public boolean equals(Object unidade) {
		if (this.getClass() != unidade.getClass()) {
			return false;
		}
		
		Real unidadeReal = (Real) unidade;
		
		if (this.valor != unidadeReal.valor) {
			return false;
		}
		return true;
	}
}
