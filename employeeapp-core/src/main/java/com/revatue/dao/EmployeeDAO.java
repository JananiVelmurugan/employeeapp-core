package com.revatue.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revatue.model.Employee;
import com.revatue.util.ConnectionUtil;

public class EmployeeDAO {

	private static Connection connnection = ConnectionUtil.getConnection();

	public void add(Employee employee) throws ClassNotFoundException, SQLException {
		String sql = "insert into EMPLOYEE(ID,NAME) values(?,?)";
		PreparedStatement pst = connnection.prepareStatement(sql);
		pst.setInt(1, employee.getId());
		pst.setString(2, employee.getName());
		int rows = pst.executeUpdate();
		System.out.println("Number of Rows Inserted : " + rows);
	}

	public void modify(Employee employee) throws ClassNotFoundException, SQLException {

		String sql = "update EMPLOYEE set NAME=? where ID=?";
		PreparedStatement pst = connnection.prepareStatement(sql);
		pst.setString(1, employee.getName());
		pst.setInt(2, employee.getId());
		int rows = pst.executeUpdate();
		System.out.println("Number of Rows Updated : " + rows);
	}

	public void remove(int id) throws ClassNotFoundException, SQLException {

		String sql = "delete from EMPLOYEE where ID=?";
		PreparedStatement pst = connnection.prepareStatement(sql);
		pst.setInt(1, id);
		int rows = pst.executeUpdate();
		System.out.println("Number of Rows Deleted : " + rows);
	}

	public void listAll() throws SQLException {
		String sql = "select * from EMPLOYEE";
		PreparedStatement pst = connnection.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();

		while (rs.next()) {
			Employee employee = new Employee();
			employee.setId(rs.getInt("ID"));
			employee.setName(rs.getString("NAME"));
			System.out.println(employee);
		}

	}

}
