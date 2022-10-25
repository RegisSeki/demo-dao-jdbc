package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=======INSERT DEPARTMENT=======");
		Department newDepartment = new Department(null, "Food");
//		departmentDao.insert(newDepartment);
//		System.out.println("Inserted! New department id: " + newDepartment.getId());
		
		System.out.println("=======UPDATE DEPARTMENT=======");
		Department updateDepartment = new Department(7, "New Food");
		departmentDao.update(updateDepartment);
		System.out.println("Update completed!");
	}

}
