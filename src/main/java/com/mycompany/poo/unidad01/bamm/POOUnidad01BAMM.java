/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.unidad01.bamm;

/**
 *
 * @author USER
 */
public class POOUnidad01BAMM {
    
    public static void main(String[]args){
        System.out.println("Hola Mundo");
          
        var autoMauricio = new Auto();
        autoMauricio.color = "amarillo";
        autoMauricio.marca = "chevrolet";
        autoMauricio.year = 2017;
        autoMauricio.placa = "ABF8592";
        autoMauricio.precio = 12000;
        
        System.out.println(autoMauricio.color+" | "+ autoMauricio.marca+ "|"+autoMauricio.year+ " | "+autoMauricio.placa+ " | "+autoMauricio.precio+" | ");
        
        var esTaxi = false;
        esTaxi = autoMauricio.esTaxi();
        if(esTaxi == true){
            System.out.println("El auto de placa: "+autoMauricio.placa+" es un taxi");
        }else{
                        System.out.println("El auto de placa: "+autoMauricio.placa+" no es un taxi");

        }
                
         var autoJuan = new Auto();
        autoJuan.color = "blanco";
        autoJuan.marca ="cupra";
        autoJuan.year = 2022;
        autoJuan.placa = "ABC456";
        autoJuan.precio = 22199;
        
        System.out.println(autoJuan.color+" | "+ autoJuan.marca+ "|"+autoJuan.year+ " | "+autoJuan.placa+ " | ");
        esTaxi = autoJuan.esTaxi();
        if(esTaxi == true){
            System.out.println("El auto de placa: "+autoJuan.placa+" es un taxi");
        }else{
                        System.out.println("El auto de placa: "+autoJuan.placa+" no es un taxi"); 
     }
        System.out.println("el auto de precio: "+autoMauricio.precio+" debe pagar de tasa solidaria: "+autoMauricio.calcularTasaSolidaria());
        System.out.println("el auto de precio: "+autoJuan.precio+" debe pagar de tasa solidaria: "+autoJuan.calcularTasaSolidaria());

        System.out.println("el auto de precio: "+autoMauricio.precio+" el valor a pagar de la matricula es de: "+autoMauricio.calcularMatricula());
        System.out.println("el auto de precio: "+autoMauricio.precio+" el valor a pagar de la matricula es de: "+autoJuan.calcularMatricula());
        


    }
}

