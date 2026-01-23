public class Main {
    public static void main(String[] args){
        System.out.println("Essa é a Naviflix");
        System.out.println("Filme: Joker");

        int anoDeLancamento = 2019;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean premium = true;
        double nota = 8;
        //média calculada pela minha nota e a nota do imdb
        double media = (9 + 8.3)  /2;
        System.out.println(media);

        String sinopse;
        sinopse = "Um comediante falido enlouquece e se torna o melhor vilão de todos";
        System.out.println(sinopse);

        int estrelas = (int) (media /2);                //int para converter
        System.out.println(estrelas);


    }
}