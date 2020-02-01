
package com.mycompany.proyectofinallp;

public class ConsumerGroup {
    
    private Buffer buffer;
    
    public ConsumerGroup(Buffer buffer) {
        this.buffer = buffer;
    }
    
    public String consume() {
        return this.buffer.consume();
    }
}
