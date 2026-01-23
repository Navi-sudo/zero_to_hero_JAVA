import java.util.Scanner;

public class Loop2 {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int gatinho = 0;

        while (gatinho != 1) {
            System.out.println("""
                Podemos adotar mais um gatinho?
                Digite 0 para Não e 1 para Sim
                """);
            gatinho = leitura.nextInt();
        }
        System.out.println("Ebaaaaaaa, gatinho novo!");
    }
}
