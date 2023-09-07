package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory  {
	
	public  static ISellerDAO createSellerDAO() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static IDepartmentDao createDepartmentDAO() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
