package MainTest;

//import DAO.IProduitDao;
import dao.ProduitDaolmp;


import entities.Articles_Approvisionnement;
//import Tables.Articles_Stock;

public class Main {
	
	public static void main(String[] args) {
		ProduitDaolmp dao = new ProduitDaolmp();
		
		
		Articles_Approvisionnement p = new Articles_Approvisionnement();
//		Articles_Stock p1 = new Articles_Stock();
		
		
		p.setCodeArt(3);
		p.setQteCommandé(3333);
		p.setDatePrevueLivraison(88833);
		
		
//		dao.getById(1);
		dao.save(p);
//		dao.delete(p)
		
		System.out.println("Les Tables et ajoute par succse");

	}
}
