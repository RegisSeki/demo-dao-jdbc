package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=======INSERT DEPARTMENT=======");
		Department newDepartment = new Department(null, "Cosmetics");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New department id: " + newDepartment.getId());
		
		System.out.println("=======UPDATE DEPARTMENT=======");
		Department updateDepartment = new Department(5, "Food and Candy");
		departmentDao.update(updateDepartment);
		System.out.println("Update completed!");
		
		System.out.println("=======DELETE DEPARTMENT=======");
		departmentDao.deleteById(7);
		System.out.println("Delete completed");
		
		System.out.println("=======FIND BY ID DEPARTMENT=======");
		Department selectDepartent = departmentDao.findById(1);
		System.out.println(selectDepartent);
		
		System.out.println("=======FIND ALL DEPARTMENT=======");
		List<Department> departments = departmentDao.findAll();
		
		for (Department d : departments) {
			System.out.println(d);
		}
	}

}
