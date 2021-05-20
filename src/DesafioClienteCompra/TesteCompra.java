package DesafioClienteCompra;

public class TesteCompra {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Rafael Alves");

        Compra compra1 = new Compra();

        compra1.addItens("Pen-Drive", 12.80, 3);
        compra1.addItens("Macbook", 12000.80, 1);
        compra1.addItens("Mouse", 12.80, 1);
        compra1.addItens("Pasta Termica", 12.80, 10);

        Compra compra2 = new Compra();
        compra1.addItens("Caneta", 1.80, 3);
        compra1.addItens("Papel", 12.80, 1);

        cliente1.compras.add(compra1);
        cliente1.compras.add(compra2);



        System.out.println("O nome do cliente é " + cliente1.nome);

        for (Compra compras: cliente1.compras){
            for (Item itens: compras.itens){
                System.out.println("O cliente comprou conosco: " + itens.produto.nome);
            }
        }

        System.out.printf("O valor total gasto foi de: R$%.2f", cliente1.getValorTotalCompras());

    }
}
