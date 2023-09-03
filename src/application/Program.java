package application;

import model.dao.DaoFactory;
import model.dao.ISellerDAO;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		ISellerDAO sellerDao = DaoFactory.createSellerDAO();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
	}


}
