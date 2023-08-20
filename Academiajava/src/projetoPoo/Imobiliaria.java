package projetoPoo;

import java.util.ArrayList;
import java.util.List;

class Imobiliaria implements Construção
{
    
	private List<Imovel> ImoveisRegistro = new ArrayList<>();
	int Imoveicadastrados=0;
	public void adicionarConstrucao(Imovel imovel) {
	if(Imoveicadastrados==getImoveisRegistro().size())
	{
		getImoveisRegistro().add(Imoveicadastrados,imovel );
		Imoveicadastrados++;
	}
	}

	public void removerConstrucao(String endere) {
	
		for(Imovel Imovel : getImoveisRegistro())
		{
		if(Imovel.getEndereço().equalsIgnoreCase(endere))
		{
		//ImoveisRegistro.remove(ImoveisRegistro.indexOf(Imovel));
		if(ImoveisRegistro.remove(ImoveisRegistro.remove(ImoveisRegistro.indexOf(Imovel)))==false)
		{
		System.out.println("Imovel Vendido!");	
		}
		}
		}
	
	}
	public  void listarConstrucoes() {
		for(Imovel Imovel : getImoveisRegistro())
		{
			System.out.println("Tipo de imovel:"+ Imovel.getTipo() + "  Endereço:"+ Imovel.getEndereço()+ " Valor:" + Imovel.getPreço() + " Comdodos:" +Imovel.getComodos()) ; 
		}
		if(ImoveisRegistro.size()==0)
		{
		System.out.println("Nenhum imovel Registrado para Venda!");	
		}
	}
	
	public void informarArea() {
	
	}

	
	

	public List<Imovel> getImoveisRegistro() {
		return ImoveisRegistro;
	}

	public void setImoveisRegistro(List<Imovel> imoveisRegistro) {
		ImoveisRegistro = imoveisRegistro;
	}

	@Override
	public void removerConstrucao(Imovel imovel) {
		// TODO Auto-generated method stub
		
	}



	
}
