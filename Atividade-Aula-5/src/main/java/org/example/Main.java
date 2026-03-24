package org.example;

import org.example.model.Aluno;
import org.example.service.MediaService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MediaService service = new MediaService();

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        double nota1 = lerNotaValida(scanner, "Digite a primeira nota:");
        double nota2 = lerNotaValida(scanner, "Digite a segunda nota:");
        double nota3 = lerNotaValida(scanner, "Digite a terceira nota:");

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        double media = service.calcularMedia(aluno);
        String status = service.verificarStatus(media);

        System.out.println("Média: " + media);
        System.out.println("Status: " + status);

        scanner.close();
    }

    private static double lerNotaValida(Scanner scanner, String mensagem) {
        double nota;

        while (true) {
            System.out.println(mensagem);
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                return nota;
            } else {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            }
        }
    }
}
