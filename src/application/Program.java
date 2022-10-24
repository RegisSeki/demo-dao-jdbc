package application;

import java.time.LocalDate;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=======FIND BY ID=======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=======FIND BY DEPARTMENT=======");
		Department department = new Department(2, "Eletronicas");
		List<Seller> sellers = sellerDao.findByDepartment(department);

		for (Seller s : sellers) {
			System.out.println(s);
		}
		
		System.out.println("\n=======FIND ALL=======");
		List<Seller> sellersFindAll = sellerDao.findAll();
		for (Seller s : sellersFindAll) {
			System.out.println(s);
		}
		
		System.out.println("\n=======INSERT SELLER=======");
		LocalDate date = LocalDate.parse("1990-07-12");
		Seller newSeller = new Seller(null, "Greg", "greg@email.com", date, 4000.00, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New seller id: " + newSeller.getId());
		
		System.out.println("\n=======UPDATE SELLER=======");
		seller = sellerDao.findById(2);
		seller.setName("Bob Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
	}

}
