
package com.mycompany.proyectofinallp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer extends Thread {
    
    public int id;
    Buffer buffer;
    private int waitTime;
    private ConsumerGroup consumerGroup;
    
    Consumer(int id, Buffer buffer, int waitTime, ConsumerGroup consumerGroup) {
        this.id = id;
        this.buffer = buffer;
        this.waitTime = waitTime;
        this.consumerGroup = consumerGroup;
    }
    
    @Override
    public void run() {
        System.out.println("Running Consumer...");
        String product;
        
        while(true) {
            product = this.consumerGroup.consume();
            //System.out.println("Consumer consumed: " + product);
            Buffer.print("Consumer " + this.id + " consumed: " + product);
            
            try {
                Thread.sleep(this.waitTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
}
