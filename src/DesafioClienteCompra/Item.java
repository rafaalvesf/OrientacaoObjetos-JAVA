package DesafioClienteCompra;

public class Item {
    int quantidade;
    Produto produto;

    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    String getNomeProduto(String nome){
        this.produto.nome = nome;
        return nome;
    }
}
