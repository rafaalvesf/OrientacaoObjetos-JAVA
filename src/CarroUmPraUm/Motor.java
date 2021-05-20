package CarroUmPraUm;

public class Motor {
    boolean ligado = false;
    double injecaoCombustivel = 1.0;
    int rpm(){
        if(!ligado){
            return 0;
        }
        else {
            return (int) Math.round(injecaoCombustivel * 1000);
        }
    }
}
