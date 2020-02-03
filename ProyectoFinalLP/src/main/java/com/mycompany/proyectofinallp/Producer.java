
package com.mycompany.proyectofinallp;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {
    
    private int id;
    private int waitTime;
    private int lowerRange, upperRange;
    private Buffer buffer;
    
    private String product;
    
    
    Producer(int id, int waitTime, int lowerRange,
            int upperRange, Buffer buffer) {
        this.id = id;
        this.waitTime = waitTime;
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
        this.buffer = buffer;
    }
    
    private String produceId(int numberOfExp) {
        return Thread.currentThread().getName() + " " + Integer.toString(numberOfExp++);
    }
    
    public synchronized String getProduct() {
        return this.product;
    }
    
    @Override
    public void run() {
        System.out.println("Running Producer...");
        Random r = new Random(System.currentTimeMillis());
        int numberOfExp = 1;
        
        String product;
        
        while(true) {
            product = new SchemeExpressionGen(
                    produceId(numberOfExp++), 
                    r.nextInt(4), 
                    this.lowerRange, this.upperRange).toString();
            
            this.buffer.produce(product);
            
//            Buffer.print("Producer " + this.id + "(" + Thread.currentThread().getName() + ")"
//                    + " produced: " + product + "\n");
            
            try {
                Thread.sleep(this.waitTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
//            if (idExpression == 10) break;
        }
    }
    
    
    
    
}
