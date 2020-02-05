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
public class EvalResult {
    
    public static float division(int a, int b) throws ArithmeticException{
        if(b==0 && a==0) throw new ArithmeticException("indetermined result: 0/0 division");
        if(b==0 ) throw new ArithmeticException("indetermined result: x/0 division");
        return a/(b+0.0f);
    }

    public static float evaluate(String product)throws ArithmeticException{
        char op = product.charAt(1);
        int a = product.charAt(3)-('0');
        int b = product.charAt(5)-('0');
        
        switch(op)
        {
            case '+':
                return a+b;
            case '-' :
                return a-b;
            case '*':
                return a*b;
            case '/':
                return division( a,  b);
            default:
                return division( a,  b); 
        }
    }
    
}
