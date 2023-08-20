package projetoPoo;


import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class GestãoImoveis {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);	
		Scanner in2 = new Scanner(System.in);	
		   
		Imobiliaria ademi = new Imobiliaria();
	
	while(1==1)
	   {
	   String index = ("""  
	   				   \nOlá, seja bem Vindo a Imobiliaria, escolha uma opção:
	   				   1- Cadastrar Novo Imovel 
			   		   2- Consultar Imovel 
			   		   3- Consultar lista de imoveis
			   		   4- Registrar venda Imovel""");	   
	   System.out.println(index);
				  
	  int opcao = in.nextInt();
	  switch(opcao)
	  {
	   
	   case 1:
	   {
		 String index1 = ("""  
 				   Para cadastrar:
 				   1- Casa
 				   2- Loja
 				   3- Predio""");	   
		   System.out.println(index1);
		int opcao2 = in.nextInt();
		switch(opcao2)
		{
		case 1:
		{
		
			System.out.println("Digite o Endereço com numero:");	
			String ender = in2.nextLine();
			System.out.println("Digite o Valor do Imovel:");	
			float preco = in.nextFloat();
			System.out.println("Digite o tipo do imovel Ex: CASA, LOJA OU PREDIO.");	
			String tipo = in2.nextLine();
			System.out.println("Digite o numero de comodos:");	
			int com = in.nextInt();
			
		Casa home = new Casa(ender,preco ,tipo,com);
		ademi.adicionarConstrucao(home);
		break;
		}
		case 2:
		{
			System.out.println("Digite o Endereço com numero:");	
			String ender1 = in2.nextLine();
			System.out.println("Digite o Valor do Imovel:");	
			float preco1 = in.nextFloat();
			System.out.println("Digite o tipo do imovel Ex: CASA, LOJA OU PREDIO.");	
			String tipo1 = in2.nextLine();
			System.out.println("Digite o numero de comodos:");	
			int com1 = in.nextInt();	
		Loja vitrine = new Loja(ender1,preco1 ,tipo1,com1);	
		ademi.adicionarConstrucao(vitrine);
		break;
		}
		case 3:
		{
			System.out.println("Digite o Endereço com numero:");	
			String ender2 = in2.nextLine();
			System.out.println("Digite o Valor do Imovel:");	
			float preco2 = in.nextFloat();
			System.out.println("Digite o tipo do imovel Ex: CASA, LOJA OU PREDIO.");	
			String tipo2 = in2.nextLine();
			System.out.println("Digite o numero de comodos:");	
			int com2 = in.nextInt();	
		Predio Andar = new Predio(ender2,preco2 ,tipo2,com2);
		ademi.adicionarConstrucao(Andar);
		break;
		}
		}		  
	    break;
		}
	  
	  
	   case 2:
		{
		System.out.println("Digite o Nome da rua e Nº do imovel qual deseja consultar: "); 
		for(Imovel Imovel : ademi.getImoveisRegistro())
		{
			if(Imovel.getEndereço().equalsIgnoreCase(in2.nextLine()))
			{
			int posi=ademi.getImoveisRegistro().indexOf(Imovel);
			System.out.println("Imovel do tipo:"+ademi.getImoveisRegistro().get(posi).getTipo()+", a venda pelo valor:"+ ademi.getImoveisRegistro().get(posi).getPreço()+" com:"+ademi.getImoveisRegistro().get(posi).getComodos()+" comodos");	   
			break;
			}
			else
			{
			System.out.println("Imovel não encontrado!");	
			}
		}
		break;
		}
	   case 3:
		  {
		  ademi.listarConstrucoes();	  
		 break;
		  }
	   case 4:
		  {
			 System.out.println("Digite o Nome da rua e Nº do imovel qual deseja vender"); 
			 try
			 {
				 ademi.removerConstrucao(in2.nextLine());
			 }
			  catch(ConcurrentModificationException e)
			 {
				System.out.println("Você apagou o ultimo imovel existente para Venda!");  
				ademi = new Imobiliaria();
				break;
			 }
			 break;
		  }
	   default:
	   {
	   System.out.println("opção invalida");	   
	   }
	   }	
	   }
	
	
	
	

}
	
}
