package com.mycompany.proyectofinallp;

public class ProducerConsumer {
    
    public static boolean inProgress;
    private final Integer bufferSize, 
            numProducers, 
            numConsumers,
            waitTimeProducer,
            waitTimeConsumer,
            lowerRange,
            upperRange;
    
    private ProducerGroup producerGroup;
    private ConsumerGroup consumerGroup;
    
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
        
        // Instantiate groups
        this.producerGroup = new ProducerGroup(buffer);
        this.consumerGroup = new ConsumerGroup(buffer);
        
        // Start producers
        for (int i = 0; i < this.numProducers; i++) {
            producerGroup.addProducer(new Producer((i+1), this.waitTimeProducer,
                    this.lowerRange, this.upperRange));
        }
        
        this.producerGroup.printSize();
        
        // Start consumers
        for (int i = 0; i < this.numConsumers; i++) {
            consumerGroup.addConsumer( new Consumer((i+1), buffer, this.waitTimeConsumer) );
        }
                
        this.producerGroup.start();
        this.consumerGroup.start();
        
    }
    
    public void stopProducerConsumer() {
        
        // Stop in progress
        inProgress = false;
    }
        
        // Stop consumer and producer
        // Stop producers
//        for (int i = 0; i < this.numProducers; i++) {
//            this.listProducers.get(i).stop();
//        }
//        //Stop consumers
//        for (int i = 0; i < this.numConsumers; i++) {
//            this.listConsumers.get(i).stop();
//        }
    
    
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
