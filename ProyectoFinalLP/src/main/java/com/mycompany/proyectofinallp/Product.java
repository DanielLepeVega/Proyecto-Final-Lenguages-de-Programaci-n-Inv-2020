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
    
    private String ID,
                    idProducer,
                    product;
    
    public Product(String ID, String idProducer) {
        this.ID = ID;
        this.idProducer = idProducer;
        this.product = "";
    }
   
    public String getID(){
        return this.ID;
    }

    public String getProduct(){
        return this.product;
    }
    
    public void setID(String ID){
        this.ID = ID;
    }
    
    public void setProduct(String product){
        this.product = product;
    }
}
