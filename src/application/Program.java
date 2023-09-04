package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.ISellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		ISellerDAO sellerDao = DaoFactory.createSellerDAO();
		System.out.println("=== TEST 1: Selller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("\n === TEST 1: Selller FindByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(x -> System.out.println(x));
		
		
	} 


}
