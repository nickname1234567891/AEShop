package com.ae.maria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionMamager {
	
    Connection conn=null;
    PreparedStatement pstmt=null ;
    ResultSet rs= null;

//  �`�N.���ݭn�gClass.forName("com.mysql.jdbc.Driver")�o�q
//  try {
//          Class.forName("org.mariadb.jdbc.Driver");
//  } catch (ClassNotFoundException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//  }

     try {
           conn=DriverManager.getConnection( "jdbc:mariadb://127.0.0.1:3306/aedb" ,"root" ,"vteam" );             
           pstmt=conn .prepareStatement("select * from userinfo");
           rs= pstmt.executeQuery();
           while(rs .next()){
                System. out.println(rs .getString("id"));  
                System. out.println(rs .getString("pswd"));      
          }
    } catch (SQLException e ) {
           // TODO Auto-generated catch block
           e.printStackTrace();
    } finally{
           try {
                 rs.close();
                 pstmt.close();
                 conn.close();
          } catch (SQLException e ) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
          }
    }           
}


}
