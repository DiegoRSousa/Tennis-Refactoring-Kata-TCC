package com.uepb.tcc.tennis;


public class TennisGame2 implements TennisGame
{
    public int J1pontuacao = 0;
    public int J2pontuacao = 0;
    
    public String J1res = "";
    public String J2res = "";
    private String nomeJogador1;
    private String nomeJogador2;

    public TennisGame2(String nomeJogador1, String nomeJogador2) {
        this.nomeJogador1 = nomeJogador1;
        this.nomeJogador2 = nomeJogador2;
    }

    public String getPontuacao(){
        String pontuacao = "";
        if (J1pontuacao == J2pontuacao && J1pontuacao < 4)
        {
            if (J1pontuacao==0)
                pontuacao = "Love";
            if (J1pontuacao==1)
                pontuacao = "Quinze";
            if (J1pontuacao==2)
                pontuacao = "Trinta";
            pontuacao += "-All";
        }
        if (J1pontuacao==J2pontuacao && J1pontuacao>=3)
            pontuacao = "Deuce";
        
        if (J1pontuacao > 0 && J2pontuacao==0)
        {
            if (J1pontuacao==1)
                J1res = "Quinze";
            if (J1pontuacao==2)
                J1res = "Trinta";
            if (J1pontuacao==3)
                J1res = "Quarenta";
            
            J2res = "Love";
            pontuacao = J1res + "-" + J2res;
        }
        if (J2pontuacao > 0 && J1pontuacao==0)
        {
            if (J2pontuacao==1)
                J2res = "Quinze";
            if (J2pontuacao==2)
                J2res = "Trinta";
            if (J2pontuacao==3)
                J2res = "Quarenta";
            
            J1res = "Love";
            pontuacao = J1res + "-" + J2res;
        }
        
        if (J1pontuacao>J2pontuacao && J1pontuacao < 4)
        {
            if (J1pontuacao==2)
                J1res="Trinta";
            if (J1pontuacao==3)
                J1res="Quarenta";
            if (J2pontuacao==1)
                J2res="Quinze";
            if (J2pontuacao==2)
                J2res="Trinta";
            pontuacao = J1res + "-" + J2res;
        }
        if (J2pontuacao>J1pontuacao && J2pontuacao < 4)
        {
            if (J2pontuacao==2)
                J2res="Trinta";
            if (J2pontuacao==3)
                J2res="Quarenta";
            if (J1pontuacao==1)
                J1res="Quinze";
            if (J1pontuacao==2)
                J1res="Trinta";
            pontuacao = J1res + "-" + J2res;
        }
        
        if (J1pontuacao > J2pontuacao && J2pontuacao >= 3)
        {
            pontuacao = "Vantagem jogador1";
        }
        
        if (J2pontuacao > J1pontuacao && J1pontuacao >= 3)
        {
            pontuacao = "Vantagem jogador2";
        }
        
        if (J1pontuacao>=4 && J2pontuacao>=0 && (J1pontuacao-J2pontuacao)>=2)
        {
            pontuacao = "Vitoria para jogador1";
        }
        if (J2pontuacao>=4 && J1pontuacao>=0 && (J2pontuacao-J1pontuacao)>=2)
        {
            pontuacao = "Vitoria para jogador2";
        }
        return pontuacao;
    }
    
    public void SetJ1Pontuacao(int numero){
        
        for (int i = 0; i < numero; i++)
        {
            J1Pontuacao();
        }
            
    }
    
    public void SetJ2pontuacao(int numero){
        
        for (int i = 0; i < numero; i++)
        {
            J2Pontuacao();
        }
            
    }
    
    public void J1Pontuacao(){
        J1pontuacao++;
    }
    
    public void J2Pontuacao(){
        J2pontuacao++;
    }

    public void ganhouPonto(String jogador) {
        if (jogador == "jogador1")
            J1Pontuacao();
        else
            J2Pontuacao();
    }
}
