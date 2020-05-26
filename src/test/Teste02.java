package test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Autor;
import model.PessoaFisica;

public class Teste02 {
	
	/**
	 * @author janio
	 * Teste de relacionamento OneToOne Unidirecional usando foreign key em campo NAO primary key
	 */
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("RelacionamentosJPA_2020");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		// salvando uma pessoa fisica
		PessoaFisica pf = new PessoaFisica();
		pf.setCpf("111.111.111-11");
		pf.setRg("1111-11");
		pf.setNome("Joaozinho");
		pf.setEmail("joaozinho@gmail.com");
		pf.setDataNascimento(new Date());
		pf = em.merge(pf);
		
		// Salvando 1o autor
		Autor a1 = new Autor();
		a1.setPessoaFisica(pf);
		em.persist(a1);
		
		// Salvando 2o autor
//		Autor a2 = new Autor();
//		a2.setPessoaFisica(pf);
//		em.persist(a2);		
		
		em.getTransaction().commit();
		
		System.out.println("feito.");
		
	}
	
	

}
