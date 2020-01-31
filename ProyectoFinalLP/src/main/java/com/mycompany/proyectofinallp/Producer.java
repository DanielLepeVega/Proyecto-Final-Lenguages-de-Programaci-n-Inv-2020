
package com.mycompany.proyectofinallp;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {
    
    private boolean exit;
    public int id;
    Buffer buffer;
    private int waitTime;
    
    Producer(int id, Buffer buffer, int waitTime, int lowerRange, 
            int upperRange) {
        this.id = id;
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        System.out.println("Running Producer...");
        String products = "AEIOU";
        Random r = new Random(System.currentTimeMillis());
        char product;
        
        
        while(true) {
            product = products.charAt(r.nextInt(5));
            this.buffer.produce(product);
            //System.out.println("Producer produced: " + product);
            Buffer.print("Producer produced: " + product);
            
            try {
                Thread.sleep(this.waitTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    
}
