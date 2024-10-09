package br.com.mello.playermusic.modules;

public class MinhasPreferidas {
    public void inclui(Titulo titulo){
        if (titulo.getClassificacao() >= 5) {
            System.out.println(titulo.getTitulo() + " está entre os TOP ouvidos.");
        } else {
            System.out.println(titulo.getTitulo() + " está entre os bem avaliados.");
        }
    }
}
