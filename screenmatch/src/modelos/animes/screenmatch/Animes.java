package modelos.animes.screenmatch;

public class Animes extends Titulo {
    private int episodios;
    private int Temporada;
    private boolean ativo;

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
}
