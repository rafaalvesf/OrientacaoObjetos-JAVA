package UnaryDesafio;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Pedido {
    public static void main(String[] args) {

        Function<Produto, Double> valorFinal = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoEstadual = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco > 3000 ? preco + 100 : preco + 50;

        Produto p = new Produto("Notebook", 3000.0, 1);

        Double preco = valorFinal
                .andThen(impostoEstadual)
                .andThen(frete)
                .apply(p);
        System.out.println("O valor final é: " + preco);
    }
}
