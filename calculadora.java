/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.java;

/**
 *
 * @author n3060
 */
public class calculadora {
    //variables
    private int operando1;
    private int operando2;
    
    
    //constructores
    
    public calculadora(){
    
}
    public calculadora (int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2; 
    }
    
  //metodos 
    
    public int sumar(){
        int suma =this.operando1 + this.operando2;
        return suma; 
    }
    
  
}