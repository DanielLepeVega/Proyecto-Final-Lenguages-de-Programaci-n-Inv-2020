
package com.mycompany.proyectofinallp;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Buffer {
    
    private LinkedList<String> buffer;
    public int n;
    
    Buffer(int n) {
        this.buffer = new LinkedList<>();
        this.n = n;
    }
    
    
    synchronized String consume() {
        String product = "";
        
        
        
        if(this.buffer.isEmpty()) {
            try {
                System.out.println(Thread.currentThread().getName() +" Waiting to consume...");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(Thread.currentThread().getName() + " trying to consume product");
        product = this.buffer.remove();
        notify();
        return product;
    }
    
    synchronized void produce(String product) {
        if(this.buffer.size() == this.n) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.buffer.add(product);
        
        notify();
    }
    
    static int count = 1;
    synchronized static void print(String string) {
        System.out.print(count++ + " ");
        System.out.println(string);
    }
    
}
