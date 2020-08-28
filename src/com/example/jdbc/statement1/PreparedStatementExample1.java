package com.example.jdbc.statement1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample1 {
	
	
			public static void main(String[] args) throws SQLException {
				
				Connection con = null;
				PreparedStatement ps = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
					con.setAutoCommit(false);
					ps = con.prepareStatement("insert into stock values(?,?,?)");
					
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
					while(true)
					{  
					  
					System.out.println("enter stock id");  
					String stock_id=br.readLine();  
					  
					System.out.println("enter stock code");  
					String stock_code=br.readLine();  
					  
					System.out.println("enter stock name");  
					String stock_name=br.readLine();  
					  
					ps.setString(1,stock_id);  
					ps.setString(2,stock_code);  
					ps.setString(3,stock_name);  
					ps.executeUpdate();  
					  
					System.out.println("commit/rollback");  
					String answer=br.readLine();  
					if(answer.equals("commit"))
					{  
					con.commit();  
					}  
					if(answer.equals("rollback")){  
					con.rollback();  
					}  
					  
					  
					System.out.println("Want to add more records y/n");  
					String ans=br.readLine();  
					if(ans.equals("n")){  
					break;  
					}  
					  
					}  
					con.commit();  
					System.out.println("record successfully saved");  
					  
					con.close();//before closing connection commit() is called  
					}
				    catch(Exception e)
					{
						System.out.println(e);}  
					  
					}

}
