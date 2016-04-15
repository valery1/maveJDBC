/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import java.sql.*;

public class ModeloConexion {
    
    public static Connection conectarse(String usuario, String password)
            throws Exception{
          String url="jdbc:mysql://localhost:3306/mysql";
        Connection con=  DriverManager.getConnection(url, usuario, password);
        //Nos autenticamos a mysql
              System.out.println("Si te conectase");             
             
              return con;
             
    }
    
    
}
