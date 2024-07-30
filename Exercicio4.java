import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercicio4 {
    public static void main(String[] args) {
        Queue<Integer> F1 = new LinkedList<>();
        Queue<Integer> F2 = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        for (int i = 0; i < 100; i++) {
            F1.add((int) (Math.random() * 100));
        }

        while (!F1.isEmpty()) {
            pilha.push(F1.poll());
        }

        while (!pilha.isEmpty()) {
            F2.add(pilha.pop());
        }

        System.out.println("Fila F2 invertida:");
        for (int num : F2) {
            System.out.println(num);
        }
    }
}
