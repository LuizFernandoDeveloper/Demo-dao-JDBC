package model.dao;

import java.util.List;

import model.entities.Department;

public interface IDepartmentDao {
	void insert(Department obj);
	void update(Department obj);
	void deletyById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	
	
}
