package br.com.mello.playermusic.principal;

import br.com.mello.playermusic.modules.Musica;
import br.com.mello.playermusic.modules.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        Podcast meuPodcast = new Podcast();

        minhaMusica.setTitulo("Deer Dance");
        minhaMusica.setArtista("System Of A Down");
        minhaMusica.setAlbum("Toxicity");
//        minhaMusica.setAno(2001);
        minhaMusica.setGenero("Nu Metal");
//        minhaMusica.setDuracaoEmSegundos(225);
//        minhaMusica.setAvisoParental(true);

        //minhaMusica.tocar();
        //minhaMusica.repetir();

        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Gustavo Mello");
        meuPodcast.setDescricao("Olá Mundo");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 25; i++) {
            meuPodcast.curtir();
        }

        System.out.println(minhaMusica.getTotalDeReproducoes());
        System.out.println(minhaMusica.getTotalDeCurtidas());

        System.out.println(meuPodcast.getTotalDeReproducoes());
        System.out.println(meuPodcast.getTotalDeCurtidas());

    }
}
