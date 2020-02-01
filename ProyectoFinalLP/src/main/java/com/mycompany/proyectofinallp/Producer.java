
package com.mycompany.proyectofinallp;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread {
    
    private int id;
    private ProducerGroup producerGroup;
    private int waitTime;
    private int lowerRange, upperRange;
    
    
    Producer(int id, ProducerGroup producerGroup, int waitTime, int lowerRange,
            int upperRange) {
        this.id = id;
        this.producerGroup = producerGroup;
        this.waitTime = waitTime;
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }
    
    private String produceId(int numberOfExp) {
        return Thread.currentThread().getName() + " " + Integer.toString(numberOfExp++);
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
            this.producerGroup.sendToBuffer(product);
            
            try {
                Thread.sleep(this.waitTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
//            if (idExpression == 10) break;
        }
    }
    
    
    
    
}
