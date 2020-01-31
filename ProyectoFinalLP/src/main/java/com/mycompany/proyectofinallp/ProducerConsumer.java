package com.mycompany.proyectofinallp;

public class ProducerConsumer extends Thread{
    
    public static boolean inProgress;
    private int bufferSize, numProducers, numConsumers;
    
    public ProducerConsumer(int bufferSize, int numProducers, int numConsumers) {
        
        this.bufferSize = bufferSize;
        this.numProducers = numProducers;
        this.numConsumers = numConsumers;
    }
    
    public void startProducerConsumer() {
        
        // In progress
        inProgress = true;
        
        // Start buffer
        Buffer buffer = new Buffer(this.bufferSize);
        
        // Start producers
        for (int i = 0; i < this.numProducers; i++) {
            Producer producer = new Producer(i, buffer);
            producer.start();
        }
        
        // Start consumers
        for (int i = 0; i < this.numConsumers; i++) {
            Consumer consumer = new Consumer(i, buffer);
            consumer.start();
        }
        
    }
    
    public void stopProducerConsumer() {
        
        // Stop in progress
        this.inProgress = false;
        
        // Stop consumer and producer
        
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
