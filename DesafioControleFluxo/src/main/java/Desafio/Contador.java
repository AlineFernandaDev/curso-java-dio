
import Desafio.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int parametroUm, parametroDois;

        System.out.println("Seja bem vindo ao contador, digite o primeiro paramêtro: ");
        parametroUm = scan.nextInt();

        while (true) {
            try {
                System.out.println("Digite o segundo número: ");
                parametroDois = scan.nextInt();

                if (parametroDois > parametroUm) {
                    break;
                } else {
                    throw new ParametrosInvalidosException();
                }
            } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo paramêtro deve ser maior que o primeiro. Tente novamente.");
            }
        }

        for (int contagem = 1; contagem <= (parametroDois - parametroUm); contagem++) {
            System.out.println("Imprimindo o número: " + contagem);
        }

        scan.close();
    }
}
