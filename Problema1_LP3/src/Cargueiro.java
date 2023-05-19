
public class Cargueiro extends Navio 
{
	private int capacidadeCarga;
	
	public Cargueiro(String nome, String anoFab, int capacidade) 
	{
		super(nome, anoFab);
		this.capacidadeCarga=capacidade;
	}
	
	public int getCapacidadeCarga() 
	{
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) 
	{
		this.capacidadeCarga = capacidadeCarga;
	}
	
	@Override
	public String toString()
	{
		return ("este e o navio: "+super.getNome()+", seu maximo de carga (em TON) e: "+this.capacidadeCarga);
	}
}
