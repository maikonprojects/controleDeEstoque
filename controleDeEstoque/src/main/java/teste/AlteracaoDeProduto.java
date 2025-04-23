package teste;

import br.com.cursopcv.modelo.Produto;
import repositorio.RepositorioProdutos;

public class AlteracaoDeProduto {
    public static void main(String[] args) {
        RepositorioProdutos repProd = new RepositorioProdutos();
        Produto prop = new Produto();

        prop.setCod(2);
        prop.setNome("Cama");
        prop.setDescricao("Cama de casal Big");
        prop.setPreco(345.00);

        repProd.alterar(2, prop);
    }
}
