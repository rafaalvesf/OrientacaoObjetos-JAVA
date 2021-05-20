package DesafioHeranca;

public class Dirigir {
    public static void main(String[] args) {
        Carro ferrari = new F458(330);
        Carro toyota = new Corolla(190);

        ferrari.acelerar();
        ferrari.acelerar();

        toyota.acelerar();
        toyota.acelerar();
        toyota.acelerar();

        System.out.printf("A velocidade de Ferrari é de: %d km/h", ferrari.velocidade);
        System.out.printf("A velocidade do Toyota é de: %d km/h", toyota.velocidade);

        ferrari.frear();

        toyota.frear();

        System.out.println();
        System.out.printf("A velocidade de Ferrari é de: %d km/h", ferrari.velocidade);
        System.out.printf("A velocidade do Toyota é de: %d km/h", toyota.velocidade);

    }
}
