/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prepa_2;

import Classes.ProcesoLavado;
import java.util.concurrent.Semaphore;


/**
 *
 * @author Hallo
 */
public class Prepa_2 {

        
    public static Semaphore semaforo1 = new Semaphore(5);
//    Semaforo 2
    public static Semaphore semaforo2 = new Semaphore(20);
    
    public static ProcesoLavado hilo1 = new ProcesoLavado(semaforo1, "Roberto");
    public static ProcesoLavado hilo2 = new ProcesoLavado(semaforo1, "Carolina");
    
    public static Semaphore semaforoMutex = new Semaphore(3);
    
    public static int numero_ropas_lavadas = 0;
    
    public static void main(String[] args) {
        
        hilo1.start();
        hilo2.start();  
        
        

    }
}
