package animes.screenmatch.principal;

import animes.screenmatch.modelos.Animes;
import animes.screenmatch.modelos.Filmes;
import animes.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filmes perfectBlue = new Filmes("Perfect Blue", 1998);
        perfectBlue.avalia(8);
        Filmes EVA1 = new Filmes("Evangelion: 1.11 Você (Não) Está Sozinho", 2007);
        EVA1.avalia(7.5);
        Filmes wolfChildren = new Filmes("Ôkami kodomo no Ame to Yuki", 2012);
        wolfChildren.avalia(8.1);
        Animes MiraNikki = new Animes("Mirai Nikki", 2011);
        MiraNikki.avalia(7.4);
        Animes OshiNoKo = new Animes("Oshi no Ko", 2024);
        OshiNoKo.avalia(8.2);
        Animes onePiece = new Animes("One Piece", 1999);
        onePiece.avalia(9);
        Animes Lain = new Animes("Serial Experiments Lain", 1998);
        Lain.avalia(8);



        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(perfectBlue);
        lista.add(EVA1);
        lista.add(wolfChildren);
        lista.add(MiraNikki);
        lista.add(OshiNoKo);
        lista.add(onePiece);
        lista.add(Lain);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filmes filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorAutor = new ArrayList<>();
        buscaPorAutor.add("Mengo Yokoyari");
        buscaPorAutor.add("Mizuho Kusanagi");
        buscaPorAutor.add("Gen Urobuchi");
        System.out.println(buscaPorAutor);

        Collections.sort(buscaPorAutor);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorAutor);
        System.out.println("Lista de titulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
