/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallp;

/**
 *
 * @author alber
 */
public class SchemeExpressionGen {
    
    private int id;
    private char operador;
    private int num1, num2;
    
    public SchemeExpressionGen(int id, char operador, int num1, int num2) {
        this.id = id;
        setOperador(operador);
        this.num1 = num1;
        this.num2 = num2;
    }
    
    private void setOperador(char operador) {
        switch (operador) {
            case 1:
                this.operador = '+';
                break;
            case 2:
                this.operador = '-';
                break;
            case 3:
                this.operador = '*';
                break;
            case 4:
                this.operador = '/';
                break;
        }
    }
    
    public String toString() {
        return "(" + this.operador + " " + this.num1 + " " + this.num2 + ")"; 
    }
}
