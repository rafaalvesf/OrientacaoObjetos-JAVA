package Reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class PrimeiroEx {
    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);

        int qtd;
        double valor, total;
        ArrayList<Double> valores = new ArrayList<Double>();

        BinaryOperator<Double> somaValores = (vl, ttl) -> vl + ttl;

        System.out.println("Quantos itens o cliente comprou?");
        qtd = rc.nextInt();
        for(int i = 0; i < qtd; i++){
            System.out.println("Digite o valor do " + (i + 1) +"° item:");
            valores.add(rc.nextDouble());
        }
        System.out.println("O valor total foi de: ");
        valores.stream().reduce(somaValores)
        .ifPresent(System.out::println);
    }
}
