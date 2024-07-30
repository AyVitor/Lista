package NovoJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercicio7 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        for (int i = 0; i < 20; i++) {
            fila.add((int) (Math.random() * 100));
        }

        System.out.println("Fila original:");
        for (int num : fila) {
            System.out.println(num);
        }

        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }

        System.out.println("Fila invertida:");
        for (int num : fila) {
            System.out.println(num);
        }
    }
}
