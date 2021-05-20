package DesafioPolimorfismo;

public class Pessoa {
    private String nome;
    private double peso;

    Pessoa(String nome, double peso){
        setNome(nome);
        setPeso(peso);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPeso(double peso){
        if (peso >= 0){
            this.peso = peso;
        }
    }
    public String getNome(){
        return "Meu nome é " + nome;
    }
    public double getPeso(){
        return peso;
    }

    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }
}
