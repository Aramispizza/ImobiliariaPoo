package projetoPoo;

public abstract class Predio extends Imovel{


	public Predio(String endereço, double preço, String tipo, int comodo,double area) {
		super(endereço, preço, tipo, comodo, area);
	
	}

	public void adicionarConstrucao(Imovel imovel) {	
	}

	public void removerConstrucao(Imovel imovel) {		
	}

	

}
