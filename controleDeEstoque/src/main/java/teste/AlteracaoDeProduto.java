package teste;

import br.com.cursopcv.modelo.Produto;
import repositorio.RepositorioProdutos;

public class AlteracaoDeProduto {
    public static void main(String[] args) {
        RepositorioProdutos repProd = new RepositorioProdutos();

        repProd.alterar(2, 345);
    }
}
