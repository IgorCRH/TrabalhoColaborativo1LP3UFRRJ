import java.util.Scanner;

public class TesteRetangulo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Retângulo 1:");
        System.out.print("Comprimento: ");
        double comprimento1 = leitura.nextDouble();
        System.out.print("Largura: ");
        double largura1 = leitura.nextDouble();

        Retangulo retangulo1 = new Retangulo();
        retangulo1.setComprimento(comprimento1);
        retangulo1.setLargura(largura1);

        System.out.println("Retângulo 2:");
        System.out.print("Comprimento: ");
        double comprimento2 = leitura.nextDouble();
        System.out.print("Largura: ");
        double largura2 = leitura.nextDouble();

        Retangulo retangulo2 = new Retangulo();
        retangulo2.setComprimento(comprimento2);
        retangulo2.setLargura(largura2);

        System.out.println("Resultados:");
        System.out.println("Retângulo 1 - Perímetro: " + retangulo1.calcularPerimetro());
        System.out.println("Retângulo 1 - Área: " + retangulo1.calcularArea());
        System.out.println("Retângulo 2 - Perímetro: " + retangulo2.calcularPerimetro());
        System.out.println("Retângulo 2 - Área: " + retangulo2.calcularArea());

        leitura.close();
    }
}
