package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory  {
	
	public  static ISellerDAO createSellerDAO() {
		return new SellerDaoJDBC();
	}
	
}
