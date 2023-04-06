package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 7L);
		em.detach(usuario); //tira o objeto do estago gerenciado garantido que ele será gerenciado e persistido apenas se tiver a função merge.
		 
		usuario.setNome("Victor Freitas Pereira");
		usuario.setEmail("vitaodazn@gmail.com");
		
//		em.merge(usuario);
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	
}
}
