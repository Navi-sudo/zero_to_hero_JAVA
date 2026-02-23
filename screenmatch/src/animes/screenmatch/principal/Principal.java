package animes.screenmatch.principal;

import animes.screenmatch.calculos.FiltroFavoritos;
import animes.screenmatch.modelos.Animes;
import animes.screenmatch.modelos.Episodio;
import animes.screenmatch.modelos.Filmes;
import animes.screenmatch.calculos.CalculadoraDeTempo;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        Animes Lain = new Animes("Serial Experiments Lain", 1998);
        Lain.setGenero("Ficção científica");
        Lain.setEpisodios(13);
        Lain.setTemporada(1);
        Lain.setAutor("Chiaki J. Konata");
        Lain.setDuracaoEmMinutos(25);
        System.out.println("Duração do episódio: " + Lain.getDuracaoEmMinutos());

        Lain.ficha();
        Lain.avalia(10);
        Lain.avalia(6);
        Lain.avalia(8);
        System.out.println(Lain.getTotalEstrelas());
        System.out.println(Lain.mediaNotas());
        System.out.println(Lain.getTemporada());
        //Lain.outroGenero("Terror");
        //Lain.outroGenero("Cyberpunk");
        //Lain.outroGenero("Drama");
        //System.out.println(Lain.totalGeneros);

        Animes onePiece = new Animes("One Piece", 1999);
        onePiece.setEpisodios(1148);
        onePiece.setGenero("Shonen");
        onePiece.setTemporada(1);
        onePiece.setAutor("Eichiiro Oda");
        onePiece.setDuracaoEmMinutos(24);
        onePiece.ficha();
        System.out.println("Duração para maratonar One Piece: " + onePiece.getDuracaoEmMinutos());

        Animes OshiNoKo = new Animes("Oshi no Ko", 2024);
        OshiNoKo.setEpisodios(12);
        OshiNoKo.setGenero("Drama Psicológico");
        OshiNoKo.setTemporada(3);
        OshiNoKo.setAutor("Mengo Yokoyari & Aka Akasaka");
        OshiNoKo.setDuracaoEmMinutos(25);
        OshiNoKo.ficha();
        System.out.println("Temporadas: " + OshiNoKo.getTemporada());
        System.out.println("Duração para maratonar Oshi no Ko: " + OshiNoKo.getDuracaoEmMinutos());

        Animes MiraNikki = new Animes("Mirai Nikki", 2011);
        MiraNikki.setEpisodios(26);
        MiraNikki.setGenero("Shonen");
        MiraNikki.setTemporada(1);
        MiraNikki.setAutor("Sakae Esuno");
        MiraNikki.setDuracaoEmMinutos(25);
        MiraNikki.ficha();
        System.out.println("Temporadas: " + MiraNikki.getTemporada());

        Filmes perfectBlue = new Filmes("Perfect Blue", 1998);
        perfectBlue.setGenero("Sena");
        perfectBlue.setDuracaoEmMinutos(73);
        perfectBlue.setAutor("Sadayuki Murai & Yoshikazu Takeuchi");
        perfectBlue.setDiretor("Satoshi Kon");
        perfectBlue.avalia(8);

        Filmes EVA1 = new Filmes("Evangelion: 1.11 Você (Não) Está Sozinho", 2007);
        EVA1.setGenero("Mecha");
        EVA1.setDuracaoEmMinutos(98);
        EVA1.setAutor("Hideaki Anno");
        EVA1.ficha();

        Filmes wolfChildren = new Filmes("Ôkami kodomo no Ame to Yuki", 2012);
        wolfChildren.setGenero("Família");
        wolfChildren.setDuracaoEmMinutos(117);
        wolfChildren.setAutor("Mamoru Hosoda & Satoko Okudera");


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(EVA1);
        calculadora.inclui(wolfChildren);
        calculadora.inclui(MiraNikki);
        System.out.println(calculadora.getTempoTotal());

        FiltroFavoritos filtro = new FiltroFavoritos();
        filtro.filtra(Lain);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setAnime(OshiNoKo);
        episodio.setNome("Mother and Children");
        episodio.setTotalVisualizacoesMal(100000);
        filtro.filtra(episodio);

        ArrayList<Filmes> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(perfectBlue);
        listaDeFilmes.add(EVA1);
        listaDeFilmes.add(wolfChildren);
        System.out.println("Tamanho da lista" + listaDeFilmes.size());
        System.out.println("Primeiro filme" + listaDeFilmes.get(0).getNome());
        System.out.println("toString" + listaDeFilmes.get(0).toString());



    }

}
