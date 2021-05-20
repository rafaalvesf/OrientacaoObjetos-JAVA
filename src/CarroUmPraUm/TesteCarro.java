package CarroUmPraUm;

public class TesteCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        System.out.println("Seu carro está ligado? " + c1.motor.ligado);
        c1.ligar();
        System.out.println("Seu carro está ligado? " + c1.motor.ligado);
        System.out.println("Giro do motor: " + c1.motor.rpm());
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println("Giro do motor: " + c1.motor.rpm());
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println("Giro do motor: " + c1.motor.rpm());
    }
}
