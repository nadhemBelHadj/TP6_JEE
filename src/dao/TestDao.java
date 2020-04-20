package dao;

import java.util.List;

import metier.entities.Produit;

public class TestDao {

	public static void main(String[] args) {
		ProduitDaoImpl pdao= new ProduitDaoImpl();
		Produit prod= pdao.save(new Produit("iphone 10 plus",5800));
		System.out.println(prod);
		
		 List<Produit> prods =pdao.produitsParMC("iphone");
		 for (Produit p : prods)
			 System.out.println(p);
		
	}

}
