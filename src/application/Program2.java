package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departDao = DaoFactory.createDepartmentDao();
		
		/*System.out.println("TEST 1: department insert");
		Department departmentInsert = new Department(null,"Phones");
		departDao.insert(departmentInsert);
		System.out.println("Insert Complete!");*/
		
		System.out.println("\nTEST 2: department findById");
		Department department = departDao.findById(2);
		System.out.println(department);
		
		System.out.println("\nTEST 3: department findAll");
		List<Department> list = departDao.findall();
		for(Object x: list) {
			System.out.println(x);
		}
		
		/*System.out.println("\nTEST 4: department deleteById");
		departDao.deleteById(6);
		System.out.println("Delete Complete!");
		
		System.out.println("\nTEST 5: department update");
		department = departDao.findById(5);
		department.setName("Socks");
		departDao.update(department);		
		System.out.println("Update Completed!");*/
	}

}
