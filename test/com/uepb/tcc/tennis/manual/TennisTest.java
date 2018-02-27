package com.uepb.tcc.tennis.manual;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.uepb.tcc.tennis.TennisGame;
import com.uepb.tcc.tennis.TennisGame1;
import com.uepb.tcc.tennis.TennisGame2;
import com.uepb.tcc.tennis.TennisGame3;

@RunWith(Parameterized.class)
public class TennisTest {

    private int pontuacaoJogador1;
    private int pontuacaoJogador2;
    private String pontuacaoEsperada;

    public TennisTest(int jogador1Score, int jogador2Score, String expectedScore) {
        this.pontuacaoJogador1 = jogador1Score;
        this.pontuacaoJogador2 = jogador2Score;
        this.pontuacaoEsperada = expectedScore;
    }
    
    @Parameters
    public static Collection<Object[]> getTodasPontuacoes() {
        return Arrays.asList(new Object[][] {
                { 0, 0, "Love-All" },
                { 1, 1, "Quinze-All" },
                { 2, 2, "Trinta-All"},
                { 3, 3, "Deuce"},
                { 4, 4, "Deuce"},
                
                { 1, 0, "Quinze-Love"},
                { 0, 1, "Love-Quinze"},
                { 2, 0, "Trinta-Love"},
                { 0, 2, "Love-Trinta"},
                { 3, 0, "Quarenta-Love"},
                { 0, 3, "Love-Quarenta"},
                { 4, 0, "Vitoria para jogador1"},
                { 0, 4, "Vitoria para jogador2"},
                
                { 2, 1, "Trinta-Quinze"},
                { 1, 2, "Quinze-Trinta"},
                { 3, 1, "Quarenta-Quinze"},
                { 1, 3, "Quinze-Quarenta"},
                { 4, 1, "Vitoria para jogador1"},
                { 1, 4, "Vitoria para jogador2"},

                { 3, 2, "Quarenta-Trinta"},
                { 2, 3, "Trinta-Quarenta"},
                { 4, 2, "Vitoria para jogador1"},
                { 2, 4, "Vitoria para jogador2"},
                
                { 4, 3, "Vantagem jogador1"},
                { 3, 4, "Vantagem jogador2"},
                { 5, 4, "Vantagem jogador1"},
                { 4, 5, "Vantagem jogador2"},
                { 15, 14, "Vantagem jogador1"},
                { 14, 15, "Vantagem jogador2"},

                { 6, 4, "Vitoria para jogador1"},
                { 4, 6, "Vitoria para jogador2"},
                { 16, 14, "Vitoria para jogador1"},
                { 14, 16, "Vitoria para jogador2"},
        });
    }

    public void verificaTodasPontuacoes(TennisGame game) {
        int highestScore = Math.max(this.pontuacaoJogador1, this.pontuacaoJogador2);
        for (int i = 0; i < highestScore; i++) {
            if (i < this.pontuacaoJogador1)
                game.ganhouPonto("jogador1");
            if (i < this.pontuacaoJogador2)
                game.ganhouPonto("jogador2");
        }
        assertEquals(this.pontuacaoEsperada, game.getPontuacao());
    }

    @Test
    public void verrificaTodasPontuacoesTennisGame1() {
        TennisGame1 game = new TennisGame1("jogador1", "jogador2");
        verificaTodasPontuacoes(game);
    }

    @Test
    public void verificaTodasPontuacoesTennisGame2() {
        TennisGame2 game = new TennisGame2("jogador1", "jogador2");
        verificaTodasPontuacoes(game);
    }

    @Test
    public void verificaTodasPontuacoesTennisGame3() {
        TennisGame3 game = new TennisGame3("jogador1", "jogador2");
        verificaTodasPontuacoes(game);
    }
}
