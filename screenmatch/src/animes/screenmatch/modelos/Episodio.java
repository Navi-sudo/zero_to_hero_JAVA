package animes.screenmatch.modelos;
import animes.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private int totalVisualizacoesMal;

    public int getTotalVisualizacoesMal() {
        return totalVisualizacoesMal;
    }

    public void setTotalVisualizacoesMal(int totalVisualizacoesMal) {
        this.totalVisualizacoesMal = totalVisualizacoesMal;
    }

    public Animes getAnime() {
        return anime;
    }

    public void setAnime(Animes anime) {
        this.anime = anime;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Animes anime;

    @Override
    public int getClassificacao() {
        if (totalVisualizacoesMal > 1000){
            return 4;
        } else {
            return 2;
        }
    }
}
