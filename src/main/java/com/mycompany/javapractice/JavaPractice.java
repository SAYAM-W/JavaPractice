/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javapractice;

/**
 *
 * @author DELL
 */
public class JavaPractice {

     public static void main(String[] args) {
        System.out.println("Hello World!");
        
        SingletonClass single = SingletonClass.getInstance();
        
        FormScreen screen = new FormScreen(0);
        screen.setVisible(true);
//        

     }}