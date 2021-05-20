package DesafioClienteCompra;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome){

        this.nome = nome;
    }


    void setCompra(Compra compras){
        this.compras.add(compras);
    }

    double getValorTotalCompras(){
        double total = 0;
        for (Compra compras: compras){
            total += compras.getValorTotal();
        }
        return total;
    }
}
