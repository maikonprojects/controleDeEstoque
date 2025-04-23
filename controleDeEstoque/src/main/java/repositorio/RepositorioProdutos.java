package repositorio;

import br.com.cursopcv.modelo.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class RepositorioProdutos {
    EntityManagerFactory emf;
    EntityManager em;

    public RepositorioProdutos() {
        emf = Persistence.createEntityManagerFactory("controleestoque");
        em = emf.createEntityManager();
    }

    public void salvar(Produto prod){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(prod);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

    public Produto alterar(int cod, Produto produto){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Produto prod = em.find(Produto.class, cod);
            em.merge(produto);
            em.getTransaction().commit();
            return prod;
        }finally {
            em.close();
        }
    }


    public void remover(Produto prod, int codigo){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            //So consegue remover se estiver sendo gerenciando no momento, por isso o merge que faz uma copia
            Produto gerenciado = em.find(Produto.class, codigo);
            em.remove(gerenciado);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public List<Produto> listarTodos(){
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Query consulta = em.createQuery("select prod from Produto prod");
            List<Produto> prod = consulta.getResultList();
            em.getTransaction().commit();
            return prod;
        }finally {
            em.close();
        }
    }

}
