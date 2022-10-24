/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet9prakpbo;

/**
 * Created  by 2134306-Nesa Athallah
 * @author user
 */
public class ElevatorTest {
     public static void main(String []args){
        Elevator myElevator = new Elevator();
        myElevator.openDoor ();
        myElevator.closeDoor ();
        myElevator.goUp ();
        myElevator.goUp ();
        myElevator.goUp ();
        myElevator.openDoor ();
        myElevator.closeDoor ();
        myElevator.goDown ();
        myElevator.openDoor ();
        myElevator.closeDoor ();
        myElevator.goDown ();
        myElevator.setFloor (myElevator.TOP_FLOOR);
        myElevator.openDoor ();
    }
}