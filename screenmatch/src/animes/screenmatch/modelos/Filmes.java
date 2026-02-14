package animes.screenmatch.modelos;
import animes.screenmatch.calculos.Classificavel;

public class Filmes extends Titulo implements Classificavel {
    private String diretor;

    public Filmes(String nome) {
        this.setNome(nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return (int) getTotalEstrelas();
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAutor() + ")";
    }
}
