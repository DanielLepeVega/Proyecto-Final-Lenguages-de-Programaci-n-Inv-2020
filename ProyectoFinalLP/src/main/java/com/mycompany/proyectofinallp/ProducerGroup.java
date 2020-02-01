
package com.mycompany.proyectofinallp;

import java.util.LinkedList;
import java.util.List;


public class ProducerGroup extends Thread {
    private List<Producer> producers;
    private Buffer buffer;
    
    public ProducerGroup(Buffer buffer) {
        this.buffer = buffer;
        this.producers = new LinkedList<>();
    }
    
    public void addProducer(Producer producer) {
        this.producers.add(producer);
    }
    
    public void sendToBuffer(String product) {
        this.buffer.produce(product);
    }
    
    @Override
    public void run() {
        System.out.println("Running threads for ProducerGroup...");
        for (Producer producer : this.producers) {
            System.out.println("Inicializando productor de hilo: " + producer.getName());
            producer.start();
            this.buffer.produce(producer.getProduct());
            
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void printSize() {
        System.out.println("Tamaño de producers (ProducerGroup): " + this.producers.size());
    }
    
//    @Override
//    public void run() {
//                
//        for (Producer producer : producers) {
//            
//        }
//    }
    
}
