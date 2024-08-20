import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List <Item> carrinho;

    public CarrinhoDeCompras(){
       this.carrinho = new ArrayList<>();

       }

    public void adicionarItem(String nome, double preco, int quantidade){
   
        carrinho.add(new Item(nome, preco, quantidade));
    
    }
    public void removerItem(String nome){
    List <Item> itensARemover = new ArrayList<>();
    for (Item item : carrinho) {
        if (item.getNome().equalsIgnoreCase(nome)) {
            itensARemover.add(item);
        }
    }
    carrinho.removeAll(itensARemover);

    }
    public double calcularValorTotal(){
        double soma = 0;
             for (int i = 0; i < carrinho.size(); i++) {
            soma += (carrinho.get(i).getPreco())*carrinho.get(i).getQuantidade();
        }
     
        return soma;
    }
    public void exibirItens(int i){
        System.out.println(carrinho);

    }

    }
