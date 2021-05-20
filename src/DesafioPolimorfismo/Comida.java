package DesafioPolimorfismo;

public class Comida {
    private String nome;
    private double peso;

    Comida(String nome, double peso){
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
        return "Uma porção de " + nome;
    }
    public double getPeso(){
        return peso;
    }
}
