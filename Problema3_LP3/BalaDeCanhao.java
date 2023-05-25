package cannon_ball;

import java.util.ArrayList;

public class BalaDeCanhao {
	private double posicao_x;
	private double posicao_y;
	private double velocidade_x;
	private double velocidade_y;
	
	public BalaDeCanhao() {
	}
	
	public BalaDeCanhao(double posicao_x, double posicao_y){
		this.posicao_x = 0;
		this.posicao_y = 0;
	}
	
	public void setPosicaoX(double posicao_x) {
		this.posicao_x += posicao_x;
	}
	
	public void setPosicaoY(double posicao_y) {
		this.posicao_y += posicao_y;
	}
	
	public void setVelocidadeX(double velocidade_x) {
		this.velocidade_x = velocidade_x;
	}
	
	public void setVelocidadeY(double velocidade_y) {
		this.velocidade_y = velocidade_y;
	}
	
	public double getPosicaoX() {
		return posicao_x;
	}
	
	public double getPosicaoY() {
		return posicao_y;
	}
	
	public double getVelocidadeX() {
		return velocidade_x;
	}
	
	public double getVelocidadeY() {
		return velocidade_y;
	}
	
	
	public void mover(double deltaSegundos) {
		double distancia_x = (getVelocidadeX() * deltaSegundos);
		double distancia_y = (getVelocidadeY() * deltaSegundos); 
		
		setPosicaoX(distancia_x);
		setPosicaoY(distancia_y);
		
		setVelocidadeY((getVelocidadeY()-9.81));
	}
	
	public Ponto getLocalizacao(){
		int x = (int) Math.round(posicao_x);
        int y = (int) Math.round(posicao_y);
        return new Ponto(x, y);
	}
	
	ArrayList<Ponto> atirar(double alpha, double v, double deltaSegundos){
		ArrayList<Ponto> listaCoordenadas = new ArrayList<>();
		setVelocidadeX(v*Math.cos(alpha));
		setVelocidadeY(v*Math.sin(alpha));
		
		while(getPosicaoY() >= 0) {
			mover(deltaSegundos);
			listaCoordenadas.add(getLocalizacao());
		}
		return listaCoordenadas;
	}
}
