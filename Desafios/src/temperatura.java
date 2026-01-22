public class temperatura {
    public static void main(String[] args){
        System.out.println("Convertendo valores de Celsius para Fahrenheit.");
        double celsius = 33;
        double fahrenheit;
        //conta para conversão
        fahrenheit = (celsius * 1.8) + 32;
        String mensagem = String.format("A temperatura em %f Celsius é equivalente a %f fahrenheit", celsius,fahrenheit);
        System.out.println(mensagem);
        int fahinteira = (int) fahrenheit;
        System.out.println("A temperatura inteira em Fahrenheit é: " + fahinteira);
    }
}
