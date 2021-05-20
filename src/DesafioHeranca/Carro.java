package DesafioHeranca;

public class Carro {
    final int VELOCIDADEMAXIMA;
    int velocidade = 0;
    int delta = 5;

    public Carro(int velocidadeMaxima) {
        this.VELOCIDADEMAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if (velocidade < VELOCIDADEMAXIMA) {
            velocidade += delta;
        }
        else{
            velocidade = VELOCIDADEMAXIMA;
        }

    }
    void frear(){
        if (velocidade > 0) {
            velocidade -= delta;
            if (velocidade < 0){
                velocidade = 0;
            }
        }
    }
}
