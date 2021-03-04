package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome to student management system");
		
		while(true) {
			System.out.println("press 1 to add student");
			System.out.println("press 2 to delete student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to update student")
			System.out.println("press 5 to exit");
			
			int input = Integer.parseInt(read.readLine());
			
			if(input==1) {
				
				System.out.println("Enter student name");
				String name = read.readLine();
				System.out.println("Enter student phone");
				String phone = read.readLine();
				System.out.println("Enter student city");
				String city = read.readLine();
				
				//add student
				StudentDetails st = new StudentDetails(name,phone,city);
				Boolean insert = StudentDao.insertStudent(st);
				if(insert) {
					System.out.println("student added successfully!");
				}
				else {
					System.out.println("something went wrong...");
				}
				
				
			}
			else if(input==2) {
				
				//delete student
				System.out.println("Enter student id to delete");
				int id = Integer.parseInt(read.readLine());
				boolean delete = StudentDao.deleteStudent(id);
				
				if(delete) {
					System.out.println("student successfully deleted!");
				}
				else {
					System.out.println("something went wrong...");
				}
				
			}
			else if(input==3) {
				
				//display student
				StudentDao.displayStudent();
			}
			else if(input==4) {
				System.out.println("Enter student id to update");
				int id = Integer.parseInt(read.readLine());
				StudentDao.updateStudent(id);
			}
			else {
				
			}
		}
	}
}





