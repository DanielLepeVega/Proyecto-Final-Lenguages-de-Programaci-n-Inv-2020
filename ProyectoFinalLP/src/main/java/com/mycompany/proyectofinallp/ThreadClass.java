/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallp;

/**
 *
 * @author yo_da
 */
public class ThreadClass extends Thread{
    
    int id,
        forN;
    public ThreadClass (int id, int forN){
        this.id = id;
        this.forN = forN;
    }
    
    @Override
    public void run(){
        System.out.println("HILO" + id);
        for(int i=0; i<this.forN ; i++){
            System.out.println("SCHEME: ");
        }
    }
}
