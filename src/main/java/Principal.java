
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int y = leitor.nextInt();

        int menor = Math.min(x, y);
        int maior = Math.max(x, y);

        for (int i = menor + 1; i < maior; i++) {

            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }

        }
        leitor.close();
    }
}
