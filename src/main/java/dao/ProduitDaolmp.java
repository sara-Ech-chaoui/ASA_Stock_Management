package dao;

import java.util.List;

import org.hibernate.Session ;
import org.hibernate.Transaction;

import entities.Articles_Approvisionnement;
import config.configuration;

public class ProduitDaolmp implements IProduitDao{

	
	public List<Articles_Approvisionnement> getAll() {
		 Session session = new configuration().getSessionFactory().getCurrentSession();
		 Transaction transaction = session.beginTransaction();
		 List<Articles_Approvisionnement> produits  = session.createQuery("from produit").getResultList();
		 
		 transaction.commit();
		 session.close();
		 return produits;
		 
	}

	public Articles_Approvisionnement getById(int id) {
		Session session = new configuration().getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Articles_Approvisionnement produit  = session.get(Articles_Approvisionnement.class,id);
		 
		 transaction.commit();
		 session.close();
		 return produit;
	}

	
	public void save(Articles_Approvisionnement produit) {
		
		Session session = new configuration().getSessionFactory().getCurrentSession();
		 Transaction transaction = session.beginTransaction();
		 session.save(produit);
		 
		 transaction.commit();
		 session.close();
		
	}

	
	public void delete(Articles_Approvisionnement produit) {
		Session session = new configuration().getSessionFactory().getCurrentSession();
		 Transaction transaction = session.beginTransaction();
		 session.delete(produit);
		 
		 transaction.commit();
		 session.close();
		
	}

	
	public void update(Articles_Approvisionnement produit) {
		Session session = new configuration().getSessionFactory().getCurrentSession();
		 Transaction transaction = session.beginTransaction();
		 session.update(produit);
		 transaction.commit();
		 session.close();
		
	}

}
