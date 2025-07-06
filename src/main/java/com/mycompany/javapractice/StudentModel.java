/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice;

/**
 *
 * @author ASUS
 */
public class StudentModel {
    private int id;
    private String email;
    private String password;
    
    
    StudentModel(int id, String email, String password){
        this.id = id;
     this.email = email;
     this.password = password;
    }
    int getId(){
    return id;
    }
   
    
    String getEmail(){
    return email;
    }
    String getPass(){
    return password;
    }
    
}