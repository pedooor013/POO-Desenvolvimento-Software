package com.example.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
    private static Connection con = null;

    public static Connection getConnection(){
        String database = "sistema";
        String host = "localhost";
        String user = "pgAdmin";
        String pass = "VeP150723!";
        String url = "jdbc:postgresql://" + host + "/" + database;
        if(con != null){
            return con;
        }else{
            try{
                con = DriverManager.getConnection(url, user, pass);
                System.out.println("Banco de Dados conectado!");
                return con;
            }catch(SQLException ex){
                System.out.println("Erro ao conectar no banco de dados!" + database);
                return null;
            }
        }
    }
}
