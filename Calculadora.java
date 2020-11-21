import java.util.Scanner;

public class Calculadora {
    //opções de calculo
    static float soma(float n1, float n2){
        return n1 + n2;
    }
    static float sub(float n1, float n2){
        return n1 - n2;
    }
    static float div(float n1, float n2){
        return n1 / n2;
    }
    static float mult(float n1, float n2){
        return n1 * n2;
    }
    static double poten(double n1, double n2) {
        return Math.pow(n1, n2);
    }

    static void menu(){
        System.out.println(
                "##############################\n" +
                "###### CALCULADORA 1.0 #######\n" +
                "##############################\n" +
                "Opções:\n" +
                "\t1 - Soma\n" +
                "\t2 - Subtração\n" +
                "\t3 - Divisão\n" +
                "\t4 - Multiplicação\n" +
                "\t5 - Potência\n" +
                "\t0 - Sair do programa\n"+
                "##############################\n" +
                        "Digite a opção desejada:\n");
    }

    static void voltarInicio(String resposta3A){
        Scanner ler2 = new Scanner(System.in);
        System.out.println("Deseja voltar para o inicio?");
        resposta3A = ler2.nextLine();
        if (resposta3A == "sim") {
            menu();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int opcoes;
        String resposta, resposta2, resposta3;
        float n1, n2;

        //Part 1
        menu();
        opcoes = ler.nextInt();

        //Part 2
        System.out.println("Digite o 1° valor: ");
        n1 = ler.nextFloat();
        System.out.println("Digite o 2° valor: ");
        n2 = ler.nextFloat();

        switch(opcoes){
            case 1:
                System.out.println("Somar " + n1 + " + " + n2 + "?");
                resposta = ler.nextLine();


            default:
                System.out.println("fechando a calculadora..");
                break;
        }

        }

    }