package CarroUmPraUm;

public class Carro {
    Motor motor = new Motor();

    void acelerar(){
        if (motor.injecaoCombustivel < 6) {
            motor.injecaoCombustivel += 0.2;
        }
    }
    void frear(){
        if(motor.injecaoCombustivel > 0.6) {
            motor.injecaoCombustivel -= 0.2;
        }
    }
    void ligar(){
        motor.ligado = true;
    }
    void desligar(){
        motor.ligado = false;
    }
}
