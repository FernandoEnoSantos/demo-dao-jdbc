package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		Department dep = depDao.findById(4);
		System.out.println("=== test 1: DepartmentDao findById ===");
		System.out.println(dep);
		System.out.println();
		
		System.out.println("=== test 2: DepartmentDao findAll ===");
		List<Department> list = depDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("=== test 3: DepartmentDao insert ===");
		Department cds = new Department(null,"Musicas");
		depDao.insert(cds);
		System.out.println("Inserted!");
		
		System.out.println();
		System.out.println("=== test 4: DepartmentDao update ===");
		cds.setName("CDS Vinil");
		depDao.update(cds);
		System.out.println("Updated");
		
		System.out.println();
		System.out.println("=== test 5: DepartmentDao delete ===");
		depDao.deleteByid(6);
		System.out.println("Deleted");
	}

}
