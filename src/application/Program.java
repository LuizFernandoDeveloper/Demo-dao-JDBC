package application;

import java.util.Date;
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
		
		System.out.println("\n === TEST 2: Selller FindByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(x -> System.out.println(x));
		
		System.out.println("\n === TEST 3: Selller FindByAll ====");
		Department departments = new Department(2, null);
	    list = sellerDao.findAll();
		list.forEach(x -> System.out.println(x));
		
		System.out.println("\n=== TEST 4: seller insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		
		System.out.println("\n=== TEST 5: seller update =====");
		seller = 	sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
	} 


}
