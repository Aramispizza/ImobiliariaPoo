package projetoPoo;

import java.util.ArrayList;
import java.util.List;

abstract class Casa extends Imovel{
	


	public Casa(String endereço, double preço, String tipo, int comodo, double area) {
		super(endereço, preço, tipo, comodo, area);
		
	}
	
	private List<Imovel> casas = new ArrayList<>();
	int Imoveicadastrados=0;
	
	public void adicionarConstrucao(Imovel imovel) {
		if(Imoveicadastrados==getCasas().size())
		{
			getCasas().add(Imoveicadastrados,imovel );
			Imoveicadastrados++;
		}
		}	
	

	public void removerConstrucao(Imovel imovel) {
		
	}

	public List<Imovel> getCasas() {
		return casas;
	}

	public void setCasas(List<Imovel> casas) {
		this.casas = casas;
	}


	

	
}
