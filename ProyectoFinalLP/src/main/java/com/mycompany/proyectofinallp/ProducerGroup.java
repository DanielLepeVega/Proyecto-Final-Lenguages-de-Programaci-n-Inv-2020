
package com.mycompany.proyectofinallp;

import java.util.LinkedList;
import java.util.List;


public class ProducerGroup {
    private List<Producer> producers;
    private Buffer buffer;
    
    public ProducerGroup(Buffer buffer) {
        this.buffer = buffer;
        this.producers = new LinkedList<>();
    }
    
    public void joinToGroup(Producer producer) {
        this.producers.add(producer);
    }
    
    public void sendToBuffer(String product) {
        this.buffer.produce(product);
    }
    
//    @Override
//    public void run() {
//                
//        for (Producer producer : producers) {
//            
//        }
//    }
    
}
