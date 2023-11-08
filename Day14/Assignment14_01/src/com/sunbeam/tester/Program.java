//Insert new candidate
//Display all candidates
//Increment votes of candidate with given id
//Delete candidate with given id
//Find candidate of given id
//Find candidates of given party
//Display total votes for each party










package com.sunbeam.tester;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
		System.out.println("1. Insert new candidate");
		System.out.println("2. Display all candidates");
		System.out.println("3. Increment votes of candidate with given id");
		System.out.println("4. Delete candidate with given id");
		System.out.println("5. Find candidate of given id");
		System.out.println("6. Find candidates of given party");
		System.out.println("7. Display total votes for each party");
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
					case 1://Insert new candidate
						String sql = "INSERT INTO candidates VALUES(default, ?, ?, ?)"; // parameterized query
						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							System.out.print("Enter Name: ");
							String name = sc.next();
							System.out.print("Enter Party: ");
							String party = sc.next();
							System.out.print("Enter Votes: ");
							int votes = sc.nextInt();
							
							stmt.setString(1, name);
							stmt.setString(2, party);
							stmt.setInt(3, votes);
							
							int count = stmt.executeUpdate();
							System.out.println("Rows Affected: " + count);
						} // stmt.close(); 
						break;
					case 2://Display all candidates
						sql = "SELECT * FROM candidates"; // parameterized query
						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							try(ResultSet rs = stmt.executeQuery()) {
								while(rs.next()) {
									int id = rs.getInt("id");
									String name = rs.getString("name");
									String party = rs.getString("party");
									int votes = rs.getInt("votes");
									System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
								}
							} // rs.close();
						
						} // stmt.close(); 
						break;
					case 3://Increment votes of candidate with given id
						int votesCount=0;
						System.out.print("Enter Id: ");
						int id = sc.nextInt();
						sql = "Update candidates set votes=votes+1 where id = ?";
						try(PreparedStatement stmt = con.prepareStatement(sql)) {	
						stmt.setInt(1, id);
						int count = stmt.executeUpdate();
						} // stmt.close();
						
						break;
					case 4 ://Delete candidate with given id
						System.out.print("Enter Id: ");
						id = sc.nextInt();
						sql = "delete from candidates where id = ?"; // parameterized query
						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							stmt.setInt(1, id);
							int count = stmt.executeUpdate();
						}
						break;
					case 5 ://Find candidate of given id
						System.out.print("Enter Id: ");
						id = sc.nextInt();
						sql = "SELECT * FROM candidates where id = ?"; // parameterized query
						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							stmt.setInt(1, id);
							try(ResultSet rs = stmt.executeQuery()) {
								while(rs.next()) {
									id = rs.getInt("id");
									String name = rs.getString("name");
									String party = rs.getString("party");
									int votes = rs.getInt("votes");
									votesCount=votes+1;
									System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
								}
								
							} // rs.close();
						
						}
						break;
					case 6://Find candidates of given party
						System.out.print("Enter Party Name ");
						String Party = sc.next();
						sql = "SELECT * FROM candidates where party = ?"; // parameterized query
						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							stmt.setString(1, Party);
							try(ResultSet rs = stmt.executeQuery()) {
								while(rs.next()) {
									id = rs.getInt("id");
									String name = rs.getString("name");
									String party = rs.getString("party");
									int votes = rs.getInt("votes");
									System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
								}
								
							} // rs.close();
						
						}
						break;
					case 7://Display total votes for each party
					
						sql = "SELECT party,sum(votes) FROM candidates group by party"; // parameterized query
						try(PreparedStatement stmt = con.prepareStatement(sql)) {
							try(ResultSet rs = stmt.executeQuery()) {
								while(rs.next()) {
									
									String party = rs.getString("party");
									int votes = rs.getInt("sum(votes)");
									System.out.printf(" %s, %d\n",party, votes);
								}
								
							} // rs.close();
						
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
