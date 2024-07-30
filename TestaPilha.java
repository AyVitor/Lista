import java.util.Random;
import java.util.Stack;

public class TestaPilha {
    public static void main(String[] args) {
        Stack<Integer> pilhaN = new Stack<>();
        Stack<Integer> pilhaP = new Stack<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int num = random.nextInt(201) - 100;
            if (num > 0) {
                pilhaP.push(num);
            } else if (num < 0) {
                pilhaN.push(num);
            } else {
                if (!pilhaP.isEmpty() && !pilhaN.isEmpty()) {
                    System.out.println("Pilha P: " + pilhaP.pop());
                    System.out.println("Pilha N: " + pilhaN.pop());
                }
            }
        }
    }
}
