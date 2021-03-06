    
package com.mycompany.proyectofinallp;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Buffer {
    
    private LinkedList<Product> buffer;
    private Updater updater;
    
    private int n;
    
    public Buffer(int n, Updater updater) {
        this.buffer = new LinkedList<>();
        this.n = n;
     
        this.updater = updater;
    }
    
    public int getSize() {
        return this.buffer.size();
    }
    
    
    synchronized Product consume(String consumerId) {
        Product product;
        
        
        while(this.buffer.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        product = this.buffer.remove();
        
        String result;

        try {
            result = "" + EvalResult.evaluate(product.getProduct());
        } catch (ArithmeticException e) {
            result = "Indeterminado";
        }
        
        this.updater.updateConsumer(consumerId, product.getProduct(), product.getIdProducer(), result, this.buffer.size(), this.n);
        notify();
        return product;
    }
    
    synchronized void produce(Product product) {
        while(this.buffer.size() == this.n) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.buffer.add(product);
        this.updater.updateProducer(product.getIdProducer(), product.getProduct(), this.buffer.size(), this.n);
        
        
        notify();
    }
    
    static int count = 1;
    synchronized static void print(String string) {
        System.out.print(count++ + " ");
        System.out.println(string);
    }
    
}
