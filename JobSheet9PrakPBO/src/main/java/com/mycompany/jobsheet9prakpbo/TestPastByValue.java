/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet9prakpbo;
//Percobaan 1 pass by value
/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
public class TestPastByValue {
    public static void main(String[] args){
        int i = 10;
        System.out.println(i);
        
        test(i);
        System.out.println(i);
        
    }
    public static void test(int j){
        j = 33;
    }
}
