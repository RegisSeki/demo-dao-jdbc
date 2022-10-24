package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department department = new Department(1, "Wears");
		
		LocalDate date = LocalDate.parse("1990-07-12");
		Seller seller = new Seller(21,"Bob", "bob@email.com", date, 3000.00, department); 
		
		System.out.println(department);
		System.out.println(seller);
	}

}
