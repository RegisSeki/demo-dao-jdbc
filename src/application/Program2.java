package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=======INSERT DEPARTMENT=======");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New department id: " + newDepartment.getId());
		
		System.out.println("=======UPDATE DEPARTMENT=======");
		Department updateDepartment = new Department(newDepartment.getId(), "New Food");
		departmentDao.update(updateDepartment);
		System.out.println("Update completed!");
		
		System.out.println("=======DELETE DEPARTMENT=======");
		Department deleteDepartment = new Department(6, null);
		departmentDao.deleteById(deleteDepartment.getId());
		System.out.println("Delete completed");
	}

}
