/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Percobaan 3 perbandingan object
package com.mycompany.jobsheet9prakpbo;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
public class EqualsTest {
    public static void main(String[] args){
        String str1, str2;
        str1 = "Free the bound periodicals.";
        
        str2 = str1;
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        System.out.println("Same object?" + (str1 == str2));
        
        str2 = new String(str1);
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        System.out.println("Same object?" + (str1 == str2));
        
        System.out.println("Same value?" + str1.equals(str2));
    }
}