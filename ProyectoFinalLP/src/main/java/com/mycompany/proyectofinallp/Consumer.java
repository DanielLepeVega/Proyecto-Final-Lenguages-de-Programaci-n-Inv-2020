
package com.mycompany.proyectofinallp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {
    
    public int id;
    private final int waitTime;
    Buffer buffer;
    
    private boolean halt;
    
    Consumer(int id, int waitTime, Buffer buffer) {
        this.id = id;
        this.waitTime = waitTime;
        this.buffer = buffer;
        this.halt = false;
    }
    
    public void halt() {
        this.halt = true;
    }
   
    
    @Override
    public void run() {
        System.out.println("Running Consumer " + this.id + "...\n");
        Product product;
        
        while(!this.halt) {
            product = this.buffer.consume(Integer.toString(this.id));

            
            try {
                Thread.sleep(this.waitTime);
                Buffer.print("Consumer " + this.id + " consumed: " + product + "\tBuffer size: " + this.buffer.getSize() + "\n");

            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
}
