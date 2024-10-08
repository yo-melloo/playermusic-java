import br.com.mello.playermusic.modules.Musica;
import br.com.mello.playermusic.modules.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        Podcast meuPodcast = new Podcast();

        minhaMusica.setTitulo("Deer Dance");
        minhaMusica.setArtista("System Of A Down");
        minhaMusica.setAlbum("Toxicity");
        minhaMusica.setAno(2001);
        minhaMusica.setGenero("Nu Metal");
        minhaMusica.setDuracaoEmSegundos(225);
        minhaMusica.setAvisoParental(true);

        //minhaMusica.tocar();
        minhaMusica.repetir();


    }
}
