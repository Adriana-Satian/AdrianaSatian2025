/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fernandasatian2025.clase;

import java.util.Stack;

/**
 *
 * @author satia
 */
public class Calculadora {
    private double resultadoactual;
    private Stack<Double> pilaResultados;
    private Stack<Double> pilaRehacer;
    private Stack<Double> Deshacer;
    private int suma;
    private int item;

    public Calculadora() {
        resultadoactual=0;
        pilaResultados= new Stack<>();
        pilaRehacer= new Stack<>();
        Deshacer= new Stack<>();
    }
    public void Rehacer(){
        if (pilaRehacer.isEmpty()){
            System.out.println("Rehacer: "+suma);
        }else{
            System.out.println("No hay acciones para Rehacer");
        }
    }
    public void Deshacer(){
        if (Deshacer.isEmpty()){
            System.out.println("Deshacer: "+suma);
        }else{
            System.out.println("No hay acciones para deshacer");
        }
    }
    
    public void MostrarResultado(){
        suma= 0;
        suma ++;
        
    }
   
}
