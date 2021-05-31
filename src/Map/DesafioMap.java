package Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        UnaryOperator<String> inverter = inv -> new StringBuilder(inv).reverse().toString();
        Function<String, Integer> binaryParaInteiro = num -> Integer.parseInt(num, 2);

        numeros.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binaryParaInteiro)
                .forEach(System.out::println);
    }
}
