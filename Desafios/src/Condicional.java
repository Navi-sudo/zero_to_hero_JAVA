public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2019;
        boolean plano = true;
        double nota = 8;
        String tipoPlano = "plus";

        if (anoDeLancamento > 2024) {
            System.out.println("Filme novo que vale a pena assistir");
        } else {
            System.out.println("Filme retro que vale a pena assistir");
        }

        if (plano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Pagar mais 7,99");
        }

    }
}
