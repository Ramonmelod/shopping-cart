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

    }
    public double calcularValorTotal(){

        return 25.5;

    }
    public void exibirItens(){
        System.out.println(carrinho.get(0)+ " " + carrinho.get(1));

    }

    }


    /*
    adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
    removerItem(String nome): Remove um item do carrinho com base no seu nome.
    calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
 */