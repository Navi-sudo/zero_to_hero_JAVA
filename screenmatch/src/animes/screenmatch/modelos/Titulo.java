package animes.screenmatch.modelos;

public class Titulo {
    public String nome;
    public String genero;
    public String totalGeneros;
    private boolean premium;
    private double estrelas;
    private int totalEstrelas;
    private String autor;
    public int duracaoEmMinutos;
    public int anoDoLancamento;

    public int getAnoDoLancamento() {
        return anoDoLancamento;
    }

    public void setAnoDoLancamento(int anoDoLancamento) {
        this.anoDoLancamento = anoDoLancamento;
    }


    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalEstrelas(){
        return totalEstrelas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void ficha(){
        System.out.println("Nome: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Nota: " + estrelas);
        System.out.println("Autor: " + autor);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    public void avalia(double notas) {
        estrelas += notas;
        totalEstrelas++;
    }

    public double mediaNotas(){
        return estrelas / totalEstrelas;
    }

    //void outroGenero(String maisGeneros){
    //    genero += maisGeneros;
    //    totalGeneros++;
    //}
}
