    
package com.mycompany.proyectofinallp;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Buffer {
    
    private LinkedList<String> buffer;
    private int n;
    
    Buffer(int n) {
        this.buffer = new LinkedList<>();
        this.n = n;
    }
    
    
    synchronized String consume() {
        String product = "";
        
        
        System.out.println("Consuming in bufffer: " + this);
        if(this.buffer.isEmpty()) {
            try {
                System.out.println(Thread.currentThread().getName() +" Waiting to consume...\n");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(Thread.currentThread().getName() + " trying to consume product");
        product = this.buffer.remove();
        System.out.println(Thread.currentThread().getName() + " consumed " + product);
        System.out.println("Buffer size after consumption: " + this.buffer.size() + "\n");

        notify();
        return product;
    }
    
    synchronized void produce(String product) {
        if(this.buffer.size() == this.n) {
            try {
                System.out.println("Buffer is full, waiting for consumers...");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(Thread.currentThread().getName() + " produced " + product);
        this.buffer.add(product);
        System.out.println("Buffer size: " + this.buffer.size() + "\n");
        
        notify();
    }
    
    static int count = 1;
    synchronized static void print(String string) {
        System.out.print(count++ + " ");
        System.out.println(string);
    }
    
}
