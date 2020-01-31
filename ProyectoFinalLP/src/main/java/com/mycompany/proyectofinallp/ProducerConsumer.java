package com.mycompany.proyectofinallp;
import java.util.*;

public class ProducerConsumer extends Thread{
    
    public static boolean inProgress;
    private final int bufferSize, 
            numProducers, 
            numConsumers,
            waitTimeProducer,
            waitTimeConsumer,
            lowerRange,
            upperRange;
    private Consumer consumer;
    private Producer producer;
    private ArrayList<Consumer> listConsumers;
    private ArrayList<Producer> listProducers;
    
    public ProducerConsumer(int bufferSize, int numProducers, int numConsumers,
            int waitTimeProducer, int waitTimeConsumer, int lowerRange, int upperRange) {
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
        
        // Start producers
        for (int i = 0; i < this.numProducers; i++) {
            Producer producer = new Producer(i, buffer, this.waitTimeProducer, 
            this.lowerRange, this.upperRange);
            producer.start();
            this.listProducers.add(producer);
        }
        
        // Start consumers
        for (int i = 0; i < this.numConsumers; i++) {
            Consumer consumer = new Consumer(i, buffer, this.waitTimeConsumer);
            consumer.start();
            this.listConsumers.add(consumer);
        }
        
    }
    
    public void stopProducerConsumer() {
        
        // Stop in progress
        inProgress = false;
        
        // Stop consumer and producer
        // Stop producers
        for (int i = 0; i < this.numProducers; i++) {
            this.listProducers.get(i).stop();
        }
        //Stop consumers
        for (int i = 0; i < this.numConsumers; i++) {
            this.listConsumers.get(i).stop();
        }
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
