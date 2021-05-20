package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> alunos = Arrays.asList("Rafa", "Jake", "Nanda","Paulo");
        System.out.println("Usando Foreach");
        for (String nome : alunos) {
            System.out.println(nome);
        }
        System.out.println("\nUsando Interator: ");
        Iterator<String> it = alunos.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\nUsando Stream: ");
        Stream<String> strm = alunos.stream();
        strm.forEach(System.out::println);
    }
}
