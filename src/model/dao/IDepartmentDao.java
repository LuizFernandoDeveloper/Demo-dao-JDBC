package model.dao;

import java.util.List;

import model.entities.Department;

public interface IDepartmentDao {
	void insert(Department obj);
	void update(Department obj);
	Department findById(Integer id);
	List<Department> findAll();
	void deleteById(Integer id);
	
	
}
