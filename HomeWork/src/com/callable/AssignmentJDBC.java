package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class AssignmentJDBC {
	Statement stmt;
	static Scanner sc = new Scanner(System.in);
	CallableStatement cst;
	ResultSet rs;
	public Connection conn = null;

	public AssignmentJDBC() {
		conn = DBConnect.getConnect();
		try {
			stmt = conn.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void getAvgSalForEmp() {
		try {
			System.out.println("Enter the department_id want to search: ");
			int did = sc.nextInt();
			
			cst = conn.prepareCall("{ call AvgSalForEmp(?)}");
			cst.setInt(1, did);

			boolean status = cst.execute();
			if (status) {
				rs = cst.getResultSet();
				while (rs.next()) {
					System.out.println(rs.getInt(1)+"   "+rs.getFloat(2));
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void getdeptWiseSalary() {
		try {
			System.out.println("Enter the department_id want to search: ");
			int did = sc.nextInt();
			
			cst = conn.prepareCall("{ call deptWiseSalary(?,?)}");
			cst.setInt(1, did);
			
			cst.registerOutParameter(2, Types.FLOAT);

			boolean status = cst.execute();
			if (status) {
				rs = cst.getResultSet();
				while (rs.next()) {
					System.out.println(rs.getInt(1)+"   "+rs.getFloat(2));
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		AssignmentJDBC a1 = new AssignmentJDBC();
		//a1.getAvgSalForEmp();
		a1.getdeptWiseSalary();
	}
}
