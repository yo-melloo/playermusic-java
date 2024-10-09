package br.com.mello.playermusic.principal;

import br.com.mello.playermusic.modules.MinhasPreferidas;
import br.com.mello.playermusic.modules.Musica;
import br.com.mello.playermusic.modules.Podcast;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Musica minhaMusica = new Musica();
        Podcast meuPodcast = new Podcast();

        System.out.println("Digite o nome da música:");
        minhaMusica.setTitulo(entrada.nextLine());

        System.out.println("Digite o nome do artista");
        minhaMusica.setArtista(entrada.nextLine());

        System.out.println("Digite o nome do álbum");
        minhaMusica.setAlbum(entrada.nextLine());

        System.out.println("Digite o gênero de " + minhaMusica.getTitulo());
        minhaMusica.setGenero(entrada.nextLine());

        System.out.println("Digite o nome do Podcast:");
        meuPodcast.setTitulo(entrada.nextLine());

        System.out.println("Digite o nome do apresentador (host)");
        meuPodcast.setHost(entrada.nextLine());

        System.out.println("Qual a descrição do podcast?");
        meuPodcast.setDescricao(entrada.nextLine());


        for (int i = 0; i < 3500; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 40; i++) {
            meuPodcast.curtir();
        }


        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);


    }
}
