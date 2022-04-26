/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mdc;

/**
 *
 * @author aluno
 */
public class MathUtil {
    
   /*public static double mdc(double a, double b){
     return -1;   
    } //teste falhou */
   
   public static double mdc(double a, double b){
     if(b > 0){
         if(a % b == 0){
             return b;
         }
     }  
     return -1;
    }
   
}
