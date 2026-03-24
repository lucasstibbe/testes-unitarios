package org.example.service;

import org.example.model.Aluno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediaServiceTest {

    MediaService service = new MediaService();

    //Primeiro Teste: Para garantir que o valor da méida esteja correto
    @Test
    public void testCalcularMedia() {
        Aluno aluno = new Aluno("Teste", 6.0, 7.0, 8.0);

        double resultado = service.calcularMedia(aluno);

        assertEquals(7.0, resultado);
    }

    //Segundo Teste: Verifica se o valor mínimo do aprovado está correto
    @Test
    public void testAprovado() {
        String resultado = service.verificarStatus(7.0);

        assertEquals("Aprovado", resultado);
    }

    //Terceiro teste: Verifica se outros valores de aprovado também funcionam
    @Test
    public void testAprovadoMaiorQueSete() {
        String resultado = service.verificarStatus(9.0);

        assertEquals("Aprovado", resultado);
    }

    //Quarto teste: Testa o valor da faixa de 2ª oportunidade
    @Test
    public void testSegundaOportunidade() {
        String resultado = service.verificarStatus(5.0);

        assertEquals("2ª oportunidade", resultado);
    }

    //Quinto teste: Testar o limite inferior da 2ª oportunidade
    @Test
    public void testLimiteSegundaOportunidade() {
        String resultado = service.verificarStatus(4.0);

        assertEquals("2ª oportunidade", resultado);
    }

    //Sexto teste: Verifica se notas baixas reprovam corretamente
    @Test
    public void testReprovado() {
        String resultado = service.verificarStatus(3.5);

        assertEquals("Reprovado", resultado);
    }
}