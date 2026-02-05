package animes.screenmatch.calculos;
import animes.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filmes f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//
//    }
//    public void inclui(Animes f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }
}
