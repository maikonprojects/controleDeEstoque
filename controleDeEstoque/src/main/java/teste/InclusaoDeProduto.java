package teste;

import br.com.cursopcv.modelo.Produto;
import repositorio.RepositorioProdutos;

public class InclusaoDeProduto {
    public static void main(String[] args) {

        RepositorioProdutos repProd = new RepositorioProdutos();
        Produto prop = new Produto();

        prop.setNome("Panela");
        prop.setDescricao("Panela de Pressão 10 Litros");
        prop.setPreco(56.80);
        repProd.salvar(prop);

        Produto prop1 = new Produto();

        prop1.setNome("Cama");
        prop1.setDescricao("Cama de casal Big");
        prop1.setPreco(450.68);
        repProd.salvar(prop1);

        Produto prop2 = new Produto();

        prop2.setNome("Caixa Som");
        prop2.setDescricao("Caixa de Som JBL");
        prop2.setPreco(160.00);
        repProd.salvar(prop2);


    }
}
