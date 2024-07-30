import java.util.Scanner;
import java.util.Stack;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma sequência de caracteres:");
        String input = scanner.nextLine();
        
        Stack<Character> pilha = new Stack<>();
        for (char c : input.toCharArray()) {
            pilha.push(c);
        }
        
        System.out.println("Texto na ordem inversa:");
        StringBuilder invertido = new StringBuilder();
        while (!pilha.isEmpty()) {
            invertido.append(pilha.pop());
        }
        System.out.println(invertido.toString());
        
        System.out.println("Verificando se é um palíndromo:");
        String limpo = input.replaceAll("[\\s.]", "").toLowerCase();
        boolean isPalindromo = true;
        for (int i = 0, j = limpo.length() - 1; i < j; i++, j--) {
            if (limpo.charAt(i) != limpo.charAt(j)) {
                isPalindromo = false;
                break;
            }
        }
        System.out.println(isPalindromo ? "É um palíndromo" : "Não é um palíndromo");
    }
}
