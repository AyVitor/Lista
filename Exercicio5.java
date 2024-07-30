package NovoJava;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

public class Exercicio5 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Set<Integer> conjuntoFila = new HashSet<>();

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int num = random.nextInt(1000);
            if (conjuntoFila.contains(num)) {
                pilha.push(num);
            } else {
                fila.add(num);
                conjuntoFila.add(num);
            }
        }

        System.out.println("Fila F:");
        for (int num : fila) {
            System.out.println(num);
        }

        System.out.println("Pilha P:");
        for (int num : pilha) {
            System.out.println(num);
        }
    }
}
