package teste;

import br.com.cursopcv.modelo.Produto;
import repositorio.RepositorioProdutos;

import java.util.List;

public class ListaTodosProdutos {
    public static void main(String[] args) {

        RepositorioProdutos repProd = new RepositorioProdutos();

        List<Produto> listaProdutos = repProd.listarTodos();

        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println("Produto - " + (i +1));
            System.out.println("");
            System.out.println("Nome: " + listaProdutos.get(i).getNome());
            System.out.println("Descrição: " + listaProdutos.get(i).getDescricao());
            System.out.println("Preço: " + listaProdutos.get(i).getPreco());
            System.out.println("");
        }

    }
}
