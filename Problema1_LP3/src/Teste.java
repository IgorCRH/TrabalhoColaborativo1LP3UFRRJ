import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Navio[] meusNavios = new Navio[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite as informações do navio " + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Ano de fabricação: ");
            String anoFabricacao = scanner.nextLine();

            System.out.print("Tipo (Cargueiro ou Cruzeiro): ");
            String tipo = scanner.nextLine();

            if (tipo.equalsIgnoreCase("Cargueiro")) {
                System.out.print("Capacidade de carga (em toneladas): ");
                int capacidadeCarga = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                meusNavios[i] = new Cargueiro(nome, anoFabricacao, capacidadeCarga);
            } else if (tipo.equalsIgnoreCase("Cruzeiro")) {
                System.out.print("Número máximo de passageiros: ");
                int maxPassageiros = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                meusNavios[i] = new Cruzeiro(nome, anoFabricacao, maxPassageiros);
            } else {
                System.out.println("Tipo inválido. O navio será considerado comum.");
                meusNavios[i] = new Navio(nome, anoFabricacao);
            }
        }

        scanner.close();

        for (int i = 0; i < 5; i++) {
            System.out.println(meusNavios[i].toString());
        }
    }
}
