package generic_utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataBase_utility {
	/*
	 * to estiablish the the database connection
	 */
	Connection c=null;
	public void estiablishDBConnection() throws Exception {
		c= DriverManager.getConnection(IConstant_utility.dbPath,IConstant_utility.dbusername,IConstant_utility.dbPassword);
	}
	
	public void closeConnection() throws Exception {
		c.close();
	}
	
	public String executeQueryMethod(String Query,int index,String Exp_data) throws Exception {
		
		boolean flag=false;
		
		/*
		 * we used the method channing here
		 */
		ResultSet r=c.createStatement().executeQuery(Query);
		
		while (flag) {
			String Actual_data=r.getString(index);
			
		 	
			if(Actual_data.equals(Exp_data)) {
			flag=true;
			
			
			
			break;
			
		}
			//String value=(Actual_data.equals(Exp_data)?Actual_data:Exp_data);
				
			
		}
			
			if(flag=false) {
				System.out.println("Expected data is missmatch to the Actual data");
				return Exp_data;
			}
			else {
				return "";
			}
			
		}
}


