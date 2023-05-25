package cannon_ball;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteBalaCanhao {
	public static void main(String[] args) {
		BalaDeCanhao bala = new BalaDeCanhao();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o angulo: ");
		double alpha = entrada.nextDouble();
		
		System.out.println("Digite a velocidade inicial: ");
		double v = entrada.nextDouble();

		entrada.close();
		
		ArrayList<Ponto> coordenadas = bala.atirar(alpha, v, 2);

        for (Ponto ponto : coordenadas) {
            System.out.println("Coordenadas: (" + ponto.getX() + ", " + ponto.getY() + ")");
        }
	}
}
