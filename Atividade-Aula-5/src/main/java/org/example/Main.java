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

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        double media = service.calcularMedia(aluno);
        String status = service.verificarStatus(media);

        System.out.println("Média: " + media);
        System.out.println("Status: " + status);

        scanner.close();
    }
}