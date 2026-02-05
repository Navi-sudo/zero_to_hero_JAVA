package animes.screenmatch.modelos;
import animes.screenmatch.calculos.Classificavel;

public class Animes extends Titulo implements Classificavel {
    private int episodios;
    private int Temporada;
    private boolean ativo;
    private int totalVisualizacoesMal;

    public int getTotalVisualizacoesMal() {
        return totalVisualizacoesMal;
    }

    public void setTotalVisualizacoesMal(int totalVisualizacoesMal) {
        this.totalVisualizacoesMal = totalVisualizacoesMal;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getTemporada() {
        return Temporada;
    }

    public void setTemporada(int temporada) {
        Temporada = temporada;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return Temporada * episodios * duracaoEmMinutos;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoesMal > 1000){
            return 4;
        } else {
            return 2;
        }
    }
}
