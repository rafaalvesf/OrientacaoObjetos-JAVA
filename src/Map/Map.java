package Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
    public static void main(String[] args) {
        Consumer<String> imprima = System.out::print;

        List<String> marcas = Arrays.asList("Audi ", "BMW ", "Toyota ");

        marcas.stream().map(m -> m.toUpperCase()).forEach(imprima);
    }
}
