package DesafioPolimorfismo;

public class Comer {
    public static void main(String[] args) {
        Pessoa cliente1 = new Pessoa("Rafael", 65.0);

        Comida porcao1 = new Arroz("Arroz", 0.2);
        Comida porcao2 = new Feijao("Feijão", 0.2);
        Comida porcao3 = new Macarrao("Macarrão", 0.05);
        Comida porcao4 = new Salada("Salada", 0.02);
        Comida porcao5 = new Bife("Bife", 0.15);
        Comida porcao6 = new Sorvete("Sorvete", 0.1);

        cliente1.comer(porcao1);
        cliente1.comer(porcao2);
        cliente1.comer(porcao3);
        cliente1.comer(porcao4);
        cliente1.comer(porcao5);

        System.out.println(cliente1.getNome());
        System.out.println("Meu peso é " + cliente1.getPeso());

        cliente1.comer(porcao6);

        System.out.println(cliente1.getNome());
        System.out.println("Meu peso é " + cliente1.getPeso());
    }
}
