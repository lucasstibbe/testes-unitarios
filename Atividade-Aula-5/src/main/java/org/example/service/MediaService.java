package org.example.service;

import org.example.model.Aluno;

public class MediaService {

    public double calcularMedia(Aluno aluno) {
        validarNota(aluno.getNota1());
        validarNota(aluno.getNota2());
        validarNota(aluno.getNota3());
        return (aluno.getNota1() + aluno.getNota2() + aluno.getNota3()) / 3.0;
    }

    private void validarNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota inválida! Deve ser entre 0 e 10.");
        }
    }

    public String verificarStatus(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 4.0) {
            return "2ª oportunidade";
        } else {
            return "Reprovado";
        }
    }
}
