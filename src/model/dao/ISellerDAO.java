package model.dao;

import java.util.List;

import model.entities.Seller;

public interface ISellerDAO {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deletyById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
