/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_sch {
	
	    private static Connection connection = null;
	    private final static String ADRESS   = "jdbc:mysql://localhost";
	    private final static String DATABASE = "gestion_school";
	    private final static String USER     = "root";
	    private final static String PASSWORD = "";
	    private final static String PORT     = "3306";
	    private final static String DRIVER   = "com.mysql.jdbc.Driver";
	
	    
	    private static void loadDriver() {
	        try {
	            Class.forName(DRIVER);
	        }
	        catch (Exception e) {
	            errorHandler("Failed to load the driver " + DRIVER, e);
	        }
	    }

	  
	    private static void loadConnection() {
	        try {
	            connection = DriverManager.getConnection(getFormatedUrl(), USER, PASSWORD);
	        }
	        catch (SQLException e) {
	            errorHandler("Failed to connect to the database " + getFormatedUrl(), e);         
	        }
	    }
	    
	    private static void errorHandler(String message, Exception e) {
	        System.out.println(message);  
	        if (e != null) System.out.println(e.getMessage());   
	    }

	    
	    private static String getFormatedUrl() {
	        return ADRESS + ":" + PORT + "/" + DATABASE;
	    }
	    
	    
	    public static Connection getConnection() {
	        if (connection == null) {
	            loadDriver();
	            loadConnection();
	        }
	        return connection;
	    }
	    
	   
	    
	    public static void closeConnection() {
	        if (connection == null) {
	            errorHandler("No connection found", null);
	        }
	        else {
	            try {
	                connection.close();
	                connection = null;
	            }
	            catch (SQLException e) {
	                errorHandler("Failed to close the connection", e);
	            }
	        }
	    }
	

}

