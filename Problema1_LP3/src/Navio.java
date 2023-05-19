
public class Navio 
{
	private String nome;
	private String anoFabricacao;
	
	
	public Navio(String nome, String anoFab)
	{
		this.nome=nome;
		this.anoFabricacao=anoFab;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getAnoFabricacao() 
	{
		return anoFabricacao;
	}
	
	public void setAnoFabricacao(String anoFabricacao) 
	{
		this.anoFabricacao = anoFabricacao;
	}
	
	public String toString()
	{
		return ("este e o navio: "+this.nome+", fabricado em: "+this.anoFabricacao);
	}
}
