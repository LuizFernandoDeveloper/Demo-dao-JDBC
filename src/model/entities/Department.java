package model.entities;

import java.io.Serializable;

public class Department implements  Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	public Department() {
		
	}

	public Department(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Department [ id = " + id + ", name = " + name +" ]";
	}
	
	
	
}
