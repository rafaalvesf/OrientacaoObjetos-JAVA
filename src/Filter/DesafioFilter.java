package Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DesafioFilter {
    public static void main(String[] args) {

        Carro Carro1 = new Carro("Argo", "Fiat", "Hatch");
        Carro Carro2 = new Carro("Rav4", "Toyota", "SUV");
        Carro Carro3 = new Carro("Saveiro", "VW", "Caminhonete");
        Carro Carro4 = new Carro("Polo", "VW", "Hatch");
        Carro Carro5 = new Carro("Renegate", "Jeep", "SUV");
        Carro Carro6 = new Carro("Toro", "Fiat", "Caminhonete");
        Carro Carro7 = new Carro("A3", "Audi", "Sedan");

        List<Carro> carrosRafael = Arrays.asList(Carro1, Carro2, Carro3, Carro4, Carro5, Carro6, Carro7);

        Predicate<Carro> carregarPeso = usar -> usar.categoria == "Caminhonete";
        Predicate<Carro> viajarFamilia = usar -> usar.categoria == "SUV" && usar.categoria == "Sedan";
        Predicate<Carro> trabalhar = usar -> usar.categoria == "Hatch";

        Function<Carro, String> qualUsar = deveUsar -> "Você deve usar o " + deveUsar.marca + "-"
                + deveUsar.modelo + " para a finalidade desejada";

        carrosRafael.stream()
                .filter(carregarPeso)
                .map(qualUsar)
                .forEach(System.out::println);
    }
}
