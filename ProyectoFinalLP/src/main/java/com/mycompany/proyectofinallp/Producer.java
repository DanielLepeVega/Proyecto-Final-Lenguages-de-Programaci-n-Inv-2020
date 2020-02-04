
package com.mycompany.proyectofinallp;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {
    
    public int id;
    private final int waitTime,
            lowerRange,
            upperRange;
    Buffer buffer;
        
    private boolean halt;
    
    
    Producer(int id, int waitTime, int lowerRange,
            int upperRange, Buffer buffer) {
        this.id = id;
        this.waitTime = waitTime;
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
        this.buffer = buffer;
        this.halt = false;
    }
    
    private String produceId(int numberOfExp) {
        return Thread.currentThread().getName() + "_" + Integer.toString(numberOfExp++);
    }

    public void halt() {
        this.halt = true;
    }
    
    @Override
    public void run() {
        System.out.println("Running Producer " + this.id + "...\n");
        Random r = new Random(System.currentTimeMillis());
        int numberOfExp = 1;
        
        Product product = new Product(Integer.toString(this.id));
        
        while(!this.halt) {
            product.setProduct(new SchemeExpressionGen(
                    produceId(numberOfExp++), 
                    r.nextInt(4), 
                    this.lowerRange, this.upperRange).toString());
            
            this.buffer.produce(product);
            
            
            try {
                Buffer.print("Producer " + this.id + " produced: " + product + "\tBuffer size: " + this.buffer.getSize() + "\n");
                Thread.sleep(this.waitTime);

            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
    
    
}
