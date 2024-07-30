import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Aviao {
    String nome;
    int identificador;

    Aviao(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Avião [Nome: " + nome + ", ID: " + identificador + "]";
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        Queue<Aviao> filaDecolagem = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Listar número de aviões na fila");
            System.out.println("2. Autorizar decolagem do primeiro avião");
            System.out.println("3. Adicionar avião à fila");
            System.out.println("4. Listar todos os aviões na fila");
            System.out.println("5. Listar características do primeiro avião");
            System.out.println("6. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Número de aviões na fila: " + filaDecolagem.size());
                    break;
                case 2:
                    if (!filaDecolagem.isEmpty()) {
                        Aviao decolar = filaDecolagem.poll();
                        System.out.println("Avião autorizado para decolagem: " + decolar);
                    } else {
                        System.out.println("Não há aviões na fila.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do avião:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o identificador do avião:");
                    int id = scanner.nextInt();
                    filaDecolagem.add(new Aviao(nome, id));
                    break;
                case 4:
                    if (!filaDecolagem.isEmpty()) {
                        for (Aviao aviao : filaDecolagem) {
                            System.out.println(aviao);
                        }
                    } else {
                        System.out.println("Não há aviões na fila.");
                    }
                    break;
                case 5:
                    if (!filaDecolagem.isEmpty()) {
                        System.out.println("Primeiro avião na fila: " + filaDecolagem.peek());
                    } else {
                        System.out.println("Não há aviões na fila.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
