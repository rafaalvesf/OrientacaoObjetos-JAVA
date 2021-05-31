import java.util.function.Function;
import java.util.function.UnaryOperator;

public class pedido {
	public static void main(String[] args) {
		
		Function<Produto, Double> valorFinal =
				produto -> produto.preco * ( 1 - produto.desconto);
		UnaryOperator<Double> valorImposto =
				preco -> preco >= 2500 ? preco * 1.085 : preco;			
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%2f", preco));
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".", ",");
				
		Produto p = new Produto("Notebook", 3300.00, 10.0);

		String preco = valorFinal
				.andThen(valorImposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println("O preço final é: " + preco);
	}
}
