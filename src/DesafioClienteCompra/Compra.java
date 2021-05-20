package DesafioClienteCompra;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    void addItens(Produto produto, int qtde){
        this.itens.add(new Item(produto, qtde));
    }
    void addItens(String nome, double preco, int quantidade){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto,quantidade));
    }
    double getValorTotal(){
        double total = 0;
        for (Item itens: itens){
            total += itens.quantidade * itens.produto.preco;
        }
        return total;
    }
}
