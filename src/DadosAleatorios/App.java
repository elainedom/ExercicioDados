package DadosAleatorios;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de lados: ");
        int lados = leitor.nextInt();
        System.out.println("Digite a quantidade de vezes: ");
        int vezes = leitor.nextInt();

//        System.out.println(numero);
//        System.out.println(vezes);

        Random random = new Random();

        int soma = 0;
        for (int i = 0; i < vezes; i++) {
            int numero = random.nextInt(lados) + 1;
            soma += numero;
            System.out.println(numero);
        }

        System.out.println("A soma é: " + soma);
    }
}













