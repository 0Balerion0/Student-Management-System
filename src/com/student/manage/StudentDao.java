package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean insertStudent(StudentDetails st) {
		
		boolean flag = false;
		
		try {
			
			//connection established
			Connection con = ConnectionProvider.createConnection();
			
			//insert query
			String q = "insert into student(name, phone, city) values(?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1, st.getName());
			pstmt.setString(2, st.getPhone());
			pstmt.setString(3, st.getCity());
			
			//execute
			pstmt.executeUpdate();
			flag = true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static boolean deleteStudent(int id) {
		
		boolean flag = false;
		
		try {
			
			//create connection to database
			Connection con = ConnectionProvider.createConnection();
			
			//query
			String q = "delete from student where id = ?";
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
			flag = true;
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	public static void displayStudent() {
		
		try {
			
			Connection con = ConnectionProvider.createConnection();
			
			String q = "select * from student";
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(q);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("city");
				
				System.out.println("ID : " + id);
				System.out.println("Name : " + name);
				System.out.println("Phone : " + phone);
				System.out.println("city : " + city);
				System.out.println("+++++++++++++++++++++++++++++++++++++");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void updateStudent(int id) {
		
		try {
			
			Connection con = ConnectionProvider.createConnection();
			
			String q = "update into student wherer id=?";
			PreparedStatement pstmt = con.prepareStatement(q);
			
			
			pstmt.setString(id, q);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}