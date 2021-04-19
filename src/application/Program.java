package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("TEST 1: seller findById");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\nTEST 2: seller findByDepartment");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller x : list) {
			System.out.println(x);
		}

		System.out.println("\nTEST 3: seller findAll");

		list = sellerDao.findall();
		for (Seller x : list) {
			System.out.println(x);

		}
		System.out.println("\nTEST 4: seller insert");
		Seller NewSeller = new Seller(null, "Gabriel", "gabriel@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(NewSeller);
		System.out.println("inserted! New id = " + NewSeller.getId());
		
		System.out.println("\nTEST 5: seller update");
		seller = sellerDao.findById(10);
		seller.setName("Joao marcos");
		seller.setEmail("jomarc@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update Completed!");
	}
}
