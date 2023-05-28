package dao;

import java.util.List;

import 	entities.Articles_Approvisionnement;

public interface IProduitDao {
	
	public List<Articles_Approvisionnement> getAll();
	
	public Articles_Approvisionnement getById(int id);
	
	public void save(Articles_Approvisionnement produit);
	
	public void delete(Articles_Approvisionnement produit);
	
	public void update(Articles_Approvisionnement produit);
	
}
