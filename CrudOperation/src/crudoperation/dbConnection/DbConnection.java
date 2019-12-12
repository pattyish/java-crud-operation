
package crudoperation.dbConnection;

import java.sql.*;

public class DbConnection {
    public String driver="com.mysql.jdbc.Driver";
    public String url="jdbc:mysql://localhost:3306/students";
    public String user="root";
    public String pass="";
    
 
    public Connection dbConnection() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        Class.forName(driver).newInstance();
        Connection conn =DriverManager.getConnection(url,user,pass);
        System.out.println("connected successfull");
        return conn ;
    }  
    
   }
