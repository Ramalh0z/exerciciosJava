import java.util.Scanner;
public class atv1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int nota;

        do {
            System.out.println("Digite uma nota entre 0 e 10");
            nota = ler.nextInt();

            if(nota == 0){
                System.out.println("nota invalida! digite novamente...");
            }
            if(nota > 10){
                System.out.println("nota invalida! digite novamente...");
            }
        } while(nota > 10);
    }

}
