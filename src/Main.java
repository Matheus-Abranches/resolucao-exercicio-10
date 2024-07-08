import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operations operations = new Operations();

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua nota 1:");
        int nota1 = scanner.nextInt();
        System.out.println("digite sua nota 2:");
        int nota2 = scanner.nextInt();
        System.out.println("digite sua nota 3:");
        int nota3 = scanner.nextInt();

        int soma123 = operations.sum(nota1, nota2, nota3);
        int divisao = operations.divi(soma123, 3);

        System.out.println("a média dessas 3 notas é: " + divisao);

    }
}