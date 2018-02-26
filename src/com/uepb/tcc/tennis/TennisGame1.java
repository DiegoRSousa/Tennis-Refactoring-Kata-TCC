package com.uepb.tcc.tennis;

public class TennisGame1 {
	
	private int m_pontuacao1 = 0;
    private int m_pontuacao2 = 0;
    private String nomeJogador1;
    private String nomeJogador2;
    
    public TennisGame1(String nomeJogador1, String nomeJogador2) {
        this.nomeJogador1 = nomeJogador1;
        this.nomeJogador2 = nomeJogador2;
    }
    
    public void ganhouPonto(String nomeJogador) {
        if (nomeJogador == "jogador1")
            m_pontuacao1 += 1;
        else
            m_pontuacao2 += 1;
    }
    
    public String getPontuacao() {
        String pontuacao = "";
        int pontuacaoTemp=0;
        if (m_pontuacao1 == m_pontuacao2)
        {
            switch (m_pontuacao1)
            {
                case 0:
                        pontuacao = "Love-All";
                    break;
                case 1:
                        pontuacao = "Quinze-Aa";
                    break;
                case 2:
                        pontuacao = "Trinta-All";
                    break;
                default:
                        pontuacao = "Deuce";
                    break;
                
            }
        }
        else if (m_pontuacao1>=4 || m_pontuacao2>=4)
        {
            int resultadoMenor = m_pontuacao1-m_pontuacao2;
            if (resultadoMenor==1) pontuacao ="Vantagem jogador1";
            else if (resultadoMenor ==-1) pontuacao ="Vantagem jogador2";
            else if (resultadoMenor>=2) pontuacao = "Vitoria para jogador1";
            else pontuacao ="Vitoria para jogador2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) pontuacaoTemp = m_pontuacao1;
                else { pontuacao+="-"; pontuacaoTemp = m_pontuacao2;}
                switch(pontuacaoTemp)
                {
                    case 0:
                        pontuacao+="Love";
                        break;
                    case 1:
                        pontuacao+="Quinze";
                        break;
                    case 2:
                        pontuacao+="Trinta";
                        break;
                    case 3:
                        pontuacao+="Quarenta";
                        break;
                }
            }
        }
        return pontuacao;
    }
}
