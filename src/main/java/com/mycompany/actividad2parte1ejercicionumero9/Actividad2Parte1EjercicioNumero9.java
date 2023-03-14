/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2parte1ejercicionumero9;

import java.util.Scanner;
public class Actividad2Parte1EjercicioNumero9 {

    public static void main(String[] args) {
        int VD1,VD2,VD3,SALAR,TOTVEN;
        double PORVEN,SALAR1,SALAR2,SALAR3;
        Scanner input = new Scanner(System.in);
        System.out.println("ventas depto 1");
        VD1 = input.nextInt();
        System.out.println("ventas depto 2");
        VD2 = input.nextInt();
        System.out.println("ventas depto 3");
        VD3 = input.nextInt();
        System.out.println("salario vendedores");
        SALAR = input.nextInt();
        TOTVEN = VD1+VD2+VD3;
        PORVEN = 0.33*TOTVEN;
        if(VD1>PORVEN){
            SALAR1 = SALAR+(0.2*SALAR);
        }
        else{
            SALAR1 = SALAR;
        }
        if(VD2>PORVEN){
            SALAR2 = SALAR+(0.2*SALAR);
        }
        else{
            SALAR2 = SALAR;
        }
        if(VD3>PORVEN){
            SALAR3 = SALAR+(0.2*SALAR);
        }
        else{
            SALAR3 = SALAR;
        }
        System.out.println("salario vendedores depto 1: $"+SALAR1);
        System.out.println("salario vendedores depto 2: $"+SALAR2);
        System.out.println("salario vendedores depto 3: $"+SALAR3);
    }
}
