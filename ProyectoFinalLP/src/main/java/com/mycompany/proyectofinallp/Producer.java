
package com.mycompany.proyectofinallp;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {
    
    private boolean exit;
    public int id;
    Buffer buffer;
    private int waitTime, lowerRange, upperRange;
    
    Producer(int id, Buffer buffer, int waitTime, int lowerRange, 
            int upperRange) {
        this.id = id;
        this.buffer = buffer;
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }
    
    @Override
    public void run() {
        System.out.println("Running Producer...");
        String products = "AEIOU";
        Random r = new Random(System.currentTimeMillis());
        
        int id = 1;
        
        
        
        String product;
        
        
        while(true) {
            product = new SchemeExpressionGen(id++, r.nextInt() % 4, 
                    this.lowerRange, this.upperRange).toString();
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
