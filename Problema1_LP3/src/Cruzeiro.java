
public class Cruzeiro extends Navio 
{
	private int maxPassageiros;
	
	public Cruzeiro(String nome, String anoFab, int maxPassageiros) 
	{
		super(nome, anoFab);
		this.maxPassageiros=maxPassageiros;
	}
	
	public int getMaxPassageiros() 
	{
		return maxPassageiros;
	}

	public void setMaxPassageiros(int maxPassageiros) 
	{
		this.maxPassageiros = maxPassageiros;
	}
	
	@Override
	public String toString()
	{
		return ("este e o navio: "+super.getNome()+", seu numero maximo de passageiros e: "+this.maxPassageiros);
	}

}
