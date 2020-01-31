
package com.mycompany.proyectofinallp;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Buffer {
    
    private LinkedList<String> slots;
    public int n;
    
    Buffer(int n) {
        this.slots = new LinkedList<>();
        this.n = n;
    }
    
    
    synchronized String consume() {
        String product = "";
        
        if(this.slots.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        product = this.slots.getFirst();
        this.slots.removeFirst();
        notify();
        
        return product;
    }
    
    synchronized void produce(String product) {
        if(this.slots.size() == this.n) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.slots.add(product);
        
        notify();
    }
    
    static int count = 1;
    synchronized static void print(String string) {
        System.out.print(count++ + " ");
        System.out.println(string);
    }
    
}
