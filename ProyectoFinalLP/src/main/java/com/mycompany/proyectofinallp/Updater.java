/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallp;

import javax.swing.*;
import javax.swing.table.*;
/**
 *
 * @author yo_da
 */
public class Updater {
    
    private JTable tableToDos,
                    tableDone;
    
    private JProgressBar progressBarToDo;
    
    private JTextField textFieldTasksDone;
    
    private DefaultTableModel modelToDos,
                                modelDone;
        
    private int counter;
    
    public Updater(JTable tableToDos, JTable tableDone, JProgressBar progressBarToDo, JTextField textFieldTasksDone){
        this.tableToDos = tableToDos;
        this.tableDone = tableDone;
        this.progressBarToDo = progressBarToDo;
        this.textFieldTasksDone = textFieldTasksDone;
        this.modelToDos = (DefaultTableModel)this.tableToDos.getModel();
        this.modelDone = (DefaultTableModel)this.tableDone.getModel();
        this.counter = 0;
        
        this.modelToDos.setRowCount(0);
        this.modelDone.setRowCount(0);
    }
    
    public void updateTableToDos(String idProductor, String product){
         this.modelToDos.addRow(new String [] {idProductor, product});
    }
    
    public void updateTableDone(String idConsumidor, String operacion, String idProductor, String resultado){
        //System.out.println("Imprimiendo todo antes de añadir a la tabla" + "idConsumidor: " +  idConsumidor + " operacion: " + operacion + " idProductor: " + idProductor + " resultado: " + resultado);
        this.modelDone.addRow(new String[] {idConsumidor, operacion, idProductor, resultado});
    }
    
    public void updateProgressBarToDo(int bufferSize, int maxSize){
        this.progressBarToDo.setValue((bufferSize * 100) / maxSize);
    }
    
    public void updateTextFieldTasksDone(){
        this.counter++;
        this.textFieldTasksDone.setText("" + this.counter);
    }
    
    public void updateProducer(String idProductor, String product, int bufferSize, int maxSize){
        this.updateTableToDos(idProductor, product);
        this.updateProgressBarToDo(bufferSize, maxSize);
    }
                
    public void updateConsumer(String idConsumidor, String operacion, String idProductor, String resultado, int bufferSize, int maxSize){
        this.updateTableDone(idConsumidor, operacion, idProductor, resultado);
        this.updateProgressBarToDo(bufferSize, maxSize);
        this.updateTextFieldTasksDone();
    }
}
