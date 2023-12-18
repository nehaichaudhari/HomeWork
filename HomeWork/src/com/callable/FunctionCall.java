package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class FunctionCall {
	Statement stmt;
	static Scanner sc = new Scanner(System.in);
	CallableStatement cst;
	ResultSet rs;
	public Connection conn = null;

	public FunctionCall() {
		conn = DBConnect.getConnect();
		try {
			stmt = conn.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void calTotalSalaryDeptWise() {
		System.out.println("Enter the departmen_id: ");
		int id = sc.nextInt();
		try {
			cst = conn.prepareCall("{?= call totalSalaryDept(?)}");
			cst.registerOutParameter(1, Types.INTEGER);
			cst.setInt(2, id);

			boolean status = cst.execute();
			if (!status) {
				System.out.println("Total salary of departments " + id + " is: " + cst.getInt(1));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void calAvgSalary() {
		System.out.println("Enter the department name: ");
		String dname = sc.next();
		try {
			cst = conn.prepareCall("{?= call avgSalary(?)}");
			cst.registerOutParameter(1, Types.VARCHAR);
			cst.setString(2, dname);

			boolean status = cst.execute();
			if (!status) {
				System.out.println("Average salary " + dname + " is: " + cst.getString(1));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		FunctionCall f1 = new FunctionCall();
		f1.calTotalSalaryDeptWise();
		f1.calAvgSalary();
	}

}
