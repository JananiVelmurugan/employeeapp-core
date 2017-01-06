package com.revatue.dao;

import java.sql.SQLException;

import com.revatue.dao.EmployeeDAO;
import com.revatue.model.Employee;

public class TestEmployeeDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		EmployeeDAO dao = new EmployeeDAO();

		Employee employee = new Employee();

		employee.setId(103);
		employee.setName("Senthamil");

		dao.add(employee);
		// dao.modify(employee);

		// dao.remove(101);
		dao.listAll();

	}

}
