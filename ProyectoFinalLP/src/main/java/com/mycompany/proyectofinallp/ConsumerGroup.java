
package com.mycompany.proyectofinallp;

import java.util.LinkedList;
import java.util.List;

public class ConsumerGroup extends Thread {
    
    private Buffer buffer;
    private List<Consumer> consumers;
    
    public ConsumerGroup(Buffer buffer) {
        this.buffer = buffer;
        this.consumers = new LinkedList<>();
    }
    
    public void addConsumer(Consumer consumer) {
        this.consumers.add(consumer);
    }
    
    public String consume() {
        return this.buffer.consume();
    }
    
    @Override
    public void run() {
        System.out.println("Running threads for ConsumerGroup...");
        for (Consumer consumer : this.consumers) {
            System.out.println("Inicializando consumidor de hilo: " + consumer.getName());
            consumer.start();
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    public void printSize() {
        System.out.println("Tamaño de consumers (ConsumerGroup): " + this.consumers.size() + "\n");
    }
}
