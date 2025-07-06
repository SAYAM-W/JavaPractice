/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class SingletonClass {
    private static SingletonClass instance = null;
    Connection connection = null;
    
    private SingletonClass(){
        try {
            //jdbc:mysql://localhost:3306/javabasics?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabasics","root","");
            
             if(connection!=null){
                 System.out.println("Database Connected!");
        String registerTable="CREATE TABLE IF NOT EXISTS registerTable(id INT AUTO_INCREMENT, email VARCHAR(50), password VARCHAR(50), PRIMARY KEY(id))";
                PreparedStatement ps = connection.prepareCall(registerTable);
                ps.execute();
        
    }
        } catch (SQLException ex) {
            System.getLogger(SingletonClass.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }}
    
    public static SingletonClass getInstance(){
    
    if(instance == null){
        
        instance = new SingletonClass();
        
    }
    return instance;
    
    }
    
   }
