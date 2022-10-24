package application;

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
	}

}
