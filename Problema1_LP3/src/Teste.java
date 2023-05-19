
public class Teste 
{
	public static void main(String[] args) 
	{
		Navio[] meusNavios = new Navio[5];
		
		meusNavios[0] = new Cargueiro("amanda","1984",300);
		meusNavios[1] = new Cargueiro("jessica","2000",450);
		meusNavios[2] = new Cruzeiro("Princesa do Mar","2013",1500);
		meusNavios[3] = new Cruzeiro("Camarao Vermelho","1950",3050);
		meusNavios[4] = new Navio("Juliano","2022");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(meusNavios[i].toString());
		}
	}
}
