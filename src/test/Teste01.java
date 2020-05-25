package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Teste01 {
	
	public static void main(String[] args) {
		// teste de selecao em uma tabela para gerar o banco de dados.
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("RelacionamentosJPA_2020");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("Select u FROM Usuario u");
		query.getResultList();
		System.out.println("feito.");
		
	}
	
	

}
