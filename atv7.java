import java.util.Scanner;

public class atv7 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] x = new int[5];
        int numero, maior = 0;

        System.out.println("Digite os numeros: ");
        for(int i = 0; i < x.length; i++){
            x[i] = ler.nextInt();
            maior = x[0];
            numero = x[i];

            if(numero > maior){
                maior = numero;
            }


        }
        System.out.println("O Maior número: " + maior);
    }
}
