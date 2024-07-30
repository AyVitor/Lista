import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        
        System.out.println("Digite números inteiros (digite '0' para terminar):");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;
            pilha.push(num);
        }
        
        System.out.println("Digite a chave a ser removida:");
        int chave = scanner.nextInt();
        
        Stack<Integer> tempStack = new Stack<>();
        while (!pilha.isEmpty()) {
            int top = pilha.pop();
            if (top != chave) {
                tempStack.push(top);
            }
        }
        
        while (!tempStack.isEmpty()) {
            pilha.push(tempStack.pop());
        }
        
        System.out.println("Pilha após remoção:");
        for (int num : pilha) {
            System.out.println(num);
        }
    }
}
