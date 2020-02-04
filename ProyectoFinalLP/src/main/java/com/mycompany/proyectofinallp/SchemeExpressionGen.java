/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallp;

import java.util.Random;

/**
 *
 * @author alber
 */
public class SchemeExpressionGen {
    
    private String id;
    private char operador;
    private int a, b;
    
    public SchemeExpressionGen(String id, int operador, int lowerRange, int upperRange) {
        this.id = id;
        this.setOperador(operador);
        this.setSchemeNumbers(lowerRange, upperRange);
        
    }
    
    private void setOperador(int operador) {
        switch (operador) {
            case 0:
                this.operador = '+';
                break;
            case 1:
                this.operador = '-';
                break;
            case 2:
                this.operador = '*';
                break;
            case 3:
                this.operador = '/';
                break;
            
        }
    }
    
    private void setSchemeNumbers(int lowerRange, int upperRange) {
        this.a = new Random().nextInt((upperRange - lowerRange) + 1) + lowerRange;
        this.b = new Random().nextInt((upperRange - lowerRange) + 1) + lowerRange;

    }
    
    public String toString() {
        return this.id + " (" + this.operador + " " + this.a + " " + this.b + ")"; 
    }
}
