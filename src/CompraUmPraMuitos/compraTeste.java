package CompraUmPraMuitos;

public class compraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();

        compra1.cliente = "Rafael";
        compra1.itens.add(new Item("Mascara", 5, 2.5));
        compra1.itens.add(new Item("Caneta", 3, 1.5));
        compra1.itens.add(new Item("Folha officio", 1, 12.5));
        compra1.itens.add(new Item("Fita durex", 2, 5));
        compra1.itens.add(new Item("Alcool em gel", 2, 3.75));

        System.out.println("Itens Comprados: ");
        for (Item item: compra1.itens){
            System.out.println(item.nome);
        }
        System.out.println("Valor total da compra: " + compra1.getValorTotal());

    }
}
