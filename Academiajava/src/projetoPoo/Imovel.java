package projetoPoo;

abstract public class Imovel implements Construção{

private	String endereço;
private	double preço;
private String tipo;	
private int comodo;
private double area;
  

	public Imovel(String endereço, double preço, String tipo, int comodo, double area)
   {
	this.setEndereço(endereço);   
    this.setPreço(preço);
    this.setTipo(tipo);
    this.setComodos(comodo);
    this.setArea(area); 
   }

	public void listarConstrucoes() {
		
	}
	
	public double informarArea() {
	
	return this.getArea();
	}

	public String TipoConstru()
	{
	return this.getTipo();	
	}
	
	
	
	public int Comodos()
	{
	return this.getComodos();
	}
	
	
	
	
	
	
	
	
	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getComodos() {
		return comodo;
	}

	public void setComodos(int comodo) {
		this.comodo = comodo;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
