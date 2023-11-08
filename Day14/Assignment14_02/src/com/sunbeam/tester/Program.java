//Insert new user (Voter)
//Display all users
//Delete voter with given id
//Change status of voter with given id to true
//Change the name and birth date of voter

package com.sunbeam.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {

	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	public static final String DB_USER = "D5_80681_smit";
	public static final String DB_PASSWORD = "sunbeam";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	public static int menu() {
		int choice=0;
		System.out.println("===========================================");
		System.out.println("Menu .......  ");
		System.out.println("0.Exit");
		System.out.println("1. Insert new user (Voter)");
		System.out.println("2. Display all users");
		System.out.println("3. Delete voter with given id");
		System.out.println("4. Change status of voter with given id to true");
		System.out.println("5. Change the name and birth date of voter");
		System.out.println("Enter Your Choice");
		choice = new Scanner(System.in).nextInt();
		return choice;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice =0;
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {	
				while(true) {
					choice =menu();
					switch (choice) {
					case 0:
						System.exit(0);
						break;
					case 1:
						String sql = "INSERT INTO users VALUES(default,?,?,?,?,?,?,?)"; // parameterized query
						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							System.out.print("Enter First Name: ");
							String FirstName = sc.next();
							System.out.print("Enter Last Name: ");
							String LastName = sc.next();
							System.out.print("Enter Email ID: ");
							String Email = sc.next();
							System.out.print("Enter Password: ");
							String Password = sc.next();
							System.out.print("Enter Date Of Birth: ");
							String DOB = sc.next();
							SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy");
							java.util.Date uDate = sdf.parse(DOB);
							java.sql.Date sDate= new java.sql.Date(uDate.getTime()); 
							System.out.print("Enter Status True Or False: ");
							Boolean Status = sc.nextBoolean();
							System.out.print("Enter Role: ");
							String Role = sc.next();
							
							stmt.setString(1, FirstName);
							stmt.setString(2, LastName);
							stmt.setString(3, Email);
							stmt.setString(4, Password);
							stmt.setDate(5, sDate);
							stmt.setBoolean(6, Status);
							stmt.setString(7,Role);
							
							int count = stmt.executeUpdate();
							System.out.println("Rows Affected: " + count);
						} // stmt.close(); 
						break;
					case 2:
						sql = "SELECT * FROM users"; // parameterized query
						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							try(ResultSet rs = stmt.executeQuery()) {
								while(rs.next()) {
									int id = rs.getInt("id");
									String FirstName = rs.getString("first_name");
									String LastName = rs.getString("last_name");
									String Email = rs.getString("email");
									String Password = rs.getString("password");
									java.sql.Date date = rs.getDate("dob");
									SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy");
									String Date=sdf.format(date);
									Boolean Status = rs.getBoolean("status");
									String Role = rs.getString("role");
									
									System.out.printf("%d | %s | %s | %s | %s | %s | %s | %s \n", id, FirstName, LastName, Email,Password,Date,Status,Role);
								}
							} // rs.close();
						
						}
						break;
					case 3:
						System.out.print("Enter Id: ");
						int id = sc.nextInt();
						sql = "delete from users where id = ?"; // parameterized query
						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							stmt.setInt(1, id);
							int count = stmt.executeUpdate();
						}
						break;
					case 4:
						System.out.print("Enter Id: ");
						id = sc.nextInt();
						sql = "update users set status=true where id = ?"; // parameterized query
						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							stmt.setInt(1, id);
							int count = stmt.executeUpdate();
						}
						break;
					case 5:
						System.out.print("Enter Id: ");
						id = sc.nextInt();
						System.out.print("Enter First Name: ");
						String FirstName = sc.next();
						System.out.print("Enter Date Of Birth: ");
						String DOB = sc.next();
						SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy");
						java.util.Date uDate = sdf.parse(DOB);
						java.sql.Date sDate= new java.sql.Date(uDate.getTime()); 
						sql = "update users set first_name = ?,dob=? where id = ?"; // parameterized query
						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							stmt.setInt(3, id);
							stmt.setString(1, FirstName);
							stmt.setDate(2, sDate);
							int count = stmt.executeUpdate();
						}
						break;
					default:
						break;
					}
					
				}
			
		} // con.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
