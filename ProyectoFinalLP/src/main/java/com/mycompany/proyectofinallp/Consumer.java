
package com.mycompany.proyectofinallp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {
    
    public int id;
    private int waitTime;
    Buffer buffer;
    
    Consumer(int id, int waitTime, Buffer buffer) {
        this.id = id;
        this.waitTime = waitTime;
        this.buffer = buffer;
    }
   
    
    @Override
    public void run() {
        System.out.println("Running Consumer...");
        String product;
        
        while(true) {
            product = this.buffer.consume();

//            Buffer.print("Consumer " + this.id + "(" + Thread.currentThread().getName() + ")"
//                + " consumed: " + product + "\n");
            
            try {
                Thread.sleep(this.waitTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
}
