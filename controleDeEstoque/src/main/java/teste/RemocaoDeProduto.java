package teste;

import br.com.cursopcv.modelo.Produto;
import repositorio.RepositorioProdutos;

public class RemocaoDeProduto {
    public static void main(String[] args) {
        RepositorioProdutos repProd = new RepositorioProdutos();

        Produto prop = new Produto();
        repProd.remover( 3);



    }
}
