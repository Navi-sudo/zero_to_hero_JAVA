import java.util.Scanner;

public class LoopLove {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int love = 0;

        System.out.println("O quanto você me ama?");
        love = leitura.nextInt();

        for (int i = 0; i < love; i++) {

            System.out.println("Eu te amo mais!!");
        }

    }
}
