package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteByid(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	//definido a interface Seller DAO, básico mesmo
	List<Seller> finByDepartment(Department department);
	
	
	
}
