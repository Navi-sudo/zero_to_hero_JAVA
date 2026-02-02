import modelos.animes.screenmatch.Animes;
import modelos.animes.screenmatch.Filmes;
import modelos.animes.screenmatch.calculos.CalculadoraDeTempo;

public class Principal {
    static void main(String[] args) {
        Animes Lain = new Animes();
        Lain.setNome("Serial Experiments Lain");
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

        Animes OshiNoKo = new Animes();
        OshiNoKo.setNome("Oshi no Ko");
        OshiNoKo.setEpisodios(12);
        OshiNoKo.setGenero("Drama Psicológico");
        OshiNoKo.setTemporada(3);
        OshiNoKo.setAutor("Mengo Yokoyari & Aka Akasaka");
        OshiNoKo.setDuracaoEmMinutos(25);
        OshiNoKo.ficha();
        System.out.println("Temporadas: " + OshiNoKo.getTemporada());
        System.out.println("Duração para maratonar Oshi no Ko: " + OshiNoKo.getDuracaoEmMinutos());

        Animes MiraNikki = new Animes();
        MiraNikki.setNome("Mirai Nikki");
        MiraNikki.setEpisodios(26);
        MiraNikki.setGenero("Shonen");
        MiraNikki.setTemporada(1);
        MiraNikki.setAutor("Sakae Esuno");
        MiraNikki.setDuracaoEmMinutos(25);
        MiraNikki.ficha();
        System.out.println("Temporadas: " + MiraNikki.getTemporada());

        Filmes EVA1 = new Filmes();
        EVA1.setNome("Evangelion: 1.11 Você (Não) Está Sozinho");
        EVA1.setGenero("Mecha");
        EVA1.setDuracaoEmMinutos(98);
        EVA1.setAutor("Hideaki Anno");
        EVA1.ficha();

        Filmes wolfChildren = new Filmes();
        wolfChildren.setNome("Ôkami kodomo no Ame to Yuki");
        wolfChildren.setGenero("Família");
        wolfChildren.setDuracaoEmMinutos(117);
        wolfChildren.setAutor("Mamoru Hosoda & Satoko Okudera");


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(EVA1);
        calculadora.inclui(wolfChildren);
        calculadora.inclui(MiraNikki);
        System.out.println(calculadora.getTempoTotal());



    }
}
