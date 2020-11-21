import java.util.Stack;

public class atv4 {
    public static void main(String[] args) {
        double populacaoA = 80000, populacaoB = 200000;
        double crescimentoA, crescimentoB;
        double taxaA = 3, taxaB = 1.5;
        int anos, i, counter = 0;

        crescimentoA = (populacaoA / 100) * taxaA;
        crescimentoB = (populacaoA / 100) * taxaB;

        for(i = 0; populacaoA <= populacaoB; i++){
            populacaoA += crescimentoA;
            populacaoB += crescimentoB;
        }

        System.out.println("[FINAL] população A: " + populacaoA);
        System.out.println("[FINAL] população B: " + populacaoB);

        for(i = 0; populacaoA <= populacaoB; i++){
            counter = counter + 1;
        }

        if (populacaoA == populacaoB){
            anos = counter;
            System.out.print("anos minimos: " + anos);
        }

    }
}