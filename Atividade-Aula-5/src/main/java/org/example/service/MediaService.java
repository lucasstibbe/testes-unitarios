package org.example.service;

import org.example.model.Aluno;

public class MediaService {

    public double calcularMedia(Aluno aluno) {
        return (aluno.getNota1() + aluno.getNota2() + aluno.getNota3()) / 3.0;
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
