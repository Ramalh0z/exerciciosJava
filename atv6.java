import java.util.Scanner;

public class atv6 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Numeros de 1 a 20 lado a lado: ");
        for(int x = 0; x <= 20; x++){
            System.out.print(x + " ");
        }

        System.out.println("Numeros de 1 a 20 um abaixo do outro: ");
        for(int y = 0; y <= 20; y++){
            System.out.println(y);
        }
    }
}