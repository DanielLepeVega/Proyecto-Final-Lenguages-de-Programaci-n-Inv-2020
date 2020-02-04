/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallp;

/**
 *
 * @author yo_da
 */
public class Product {
    
    private String idProducer,
            product;
    
    public Product(String idProducer) {
        this.idProducer = idProducer;
        this.product = "";
    }
   
    public String getIdProducer(){
        return this.idProducer;
    }

    public String getProduct(){
        return this.product;
    }
    
    public void setIdProducer(String ID){
        this.idProducer = idProducer;
    }
    
    public void setProduct(String product){
        this.product = product;
    }
    
    public String toString() {
        return this.idProducer + "\t" + this.product;
    }
}
