package com.mycompany.proyectofinallp;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
    
    public static boolean inProgress;
    private final Integer bufferSize, 
            numProducers, 
            numConsumers,
            waitTimeProducer,
            waitTimeConsumer,
            lowerRange,
            upperRange;
    
    private List<Producer> producerList;
    private List<Consumer> consumerList;
    
    public ProducerConsumer(Integer bufferSize, Integer numProducers, Integer numConsumers,
            Integer waitTimeProducer, Integer waitTimeConsumer, Integer lowerRange, int upperRange) {
        this.bufferSize = bufferSize;
        this.numProducers = numProducers;
        this.numConsumers = numConsumers;
        this.waitTimeProducer = waitTimeProducer;
        this.waitTimeConsumer = waitTimeConsumer;
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;  
        
        
    }
    
    public void startProducerConsumer() {
        
        // In progress
        inProgress = true;
        
        // Start buffer
        Buffer buffer = new Buffer(this.bufferSize);
        
        // Initialize producer and consumer list
        this.producerList = new ArrayList<>();
        this.consumerList = new ArrayList<>();
        
        
        // Create and start producers
        for (int i = 0; i < this.numProducers; i++) {
            this.producerList.add(new Producer((i+1), this.waitTimeProducer,
                    this.lowerRange, this.upperRange, buffer));
            this.producerList.get(i).start();
        }
        
        // Create and start consumers
        for (int i = 0; i < this.numConsumers; i++) {
            this.consumerList.add(new Consumer((i+1), this.waitTimeConsumer, buffer));
            this.consumerList.get(i).start();
        }
    }
    
    public void stopProducerConsumer() {
        
        // Stop in progress
        inProgress = false;
        
        // Stop producer
        for (int i = 0; i < this.numProducers; i++) {
            this.producerList.get(i).halt();
        }        
        //Stop consumers
        for (int i = 0; i < this.numConsumers; i++) {
            this.consumerList.get(i).halt();
        }
        
        System.out.println("All producers and consumers stopped.");
    }
        
    
    
//    public static void main(String[] args) {
//        
//        Buffer buffer = new Buffer(10);
//        
//        Producer producer = new Producer(buffer);
//        producer.start();
//        
//        Consumer consumer = new Consumer(buffer);
//        consumer.start();
//    } 
}
