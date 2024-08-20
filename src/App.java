

public class App {
    public static void main(String[] args) throws Exception {
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();   
        carrinho.adicionarItem("The Lord Of the Rings", 50.5, 5);
        carrinho.adicionarItem("Narnia's Chrornics", 25.5, 2);
        carrinho.adicionarItem("Bible", 4125.5, 1000);
        carrinho.exibirItens(0);    
        carrinho.removerItem("The Lord of the Rings");
        carrinho.exibirItens(0);  

        System.out.println("Valor total: " + carrinho.calcularValorTotal());
     
    }
}
