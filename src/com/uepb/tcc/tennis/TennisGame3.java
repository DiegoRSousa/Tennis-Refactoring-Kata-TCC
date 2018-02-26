package com.uepb.tcc.tennis;

public class TennisGame3 implements TennisGame {
    
    private int j2;
    private int j1;
    private String j1N;
    private String j2N;

    public TennisGame3(String j1N, String j2N) {
        this.j1N = j1N;
        this.j2N = j2N;
    }

    public String getPontuacao() {
        String s;
        if (j1 < 4 && j2 < 4 && !(j1 + j2 == 6)) {
            String[] p = new String[]{"Love", "Quinze", "Trinta", "Quarenta"}; 
            s = p[j1];
            return (j1 == j2) ? s + "-All" : s + "-" + p[j2];
        } else {
            if (j1 == j2)
                return "Deuce";
            s = j1 > j2 ? j1N : j2N;
            return ((j1-j2)*(j1-j2) == 1) ? "Vantagem " + s : "Vitoria para " + s;
        }
    }
    
    public void ganhouPonto(String nomeJogador) {
        if (nomeJogador == "jogador1")
            this.j1 += 1;
        else
            this.j2 += 1;
        
    }

}
