package com.Ecommerce.Upgrade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

import generic_utility.IConstant_utility;

public class Sample_database_connectiontest {

	public static void main(String[] args) throws Exception {
		Connection c = null;
		try {
			/**
			 * estiablishing the connection to the sql
			 */
	   c=   DriverManager.getConnection(IConstant_utility.dbPath, IConstant_utility.dbusername,IConstant_utility.dbPassword);
	   /**
	    * to create the statment
	    */
	   Statement s= c.createStatement();
	   /**
	    * execute the query
	    */
	   
	   ResultSet r=  s.executeQuery("select * from students");
	   while(r.next()) {
		   System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4));
	   }
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		
		}
		finally {
			c.close();
		}
	}

}
