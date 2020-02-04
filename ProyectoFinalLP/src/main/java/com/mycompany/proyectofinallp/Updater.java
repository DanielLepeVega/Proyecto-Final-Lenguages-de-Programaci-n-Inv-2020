/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallp;

import javax.swing.*;

/**
 *
 * @author yo_da
 */
public class Updater {
    
    private JTable tableToDos,
                    tableDone;
    
    private JProgressBar progressBarToDo;
    
    private JTextField textFieldTasksDone;
    
    public Updater(JTable tableToDos, JTable tableDone, JProgressBar progressBarToDo, JTextField textFieldTasksDone){
        this.tableToDos = tableToDos;
        this.tableDone = tableDone;
        this.progressBarToDo = progressBarToDo;
        this.textFieldTasksDone = textFieldTasksDone;
    }
    
    public void updateTableToDos(String idProductor, String product){
        //this.tableToDos.add();
    }
    
    public void updateTableDone(){
        
    }
    
    public void updateProgressBarToDo(int bufferSize){
        this.progressBarToDo.setValue(bufferSize);
    }
    
    public void updateTextFieldTasksDone(){
        
    }
    
    public void updateProducer(String idProductor, String product, int bufferSize){
        this.updateTableToDos(idProductor, product);
        this.updateProgressBarToDo(bufferSize);
    }
                
    public void updateConsumer(){
        
    }
    
    public void updateGUI(){
        
    }
}
