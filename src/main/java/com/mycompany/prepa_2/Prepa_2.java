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
    
//    Semáforo 1 (El que se usa)        
    public static Semaphore semaforo1 = new Semaphore(5);
//    Semaforo 2 (No lo uso porque bueno xd)
    public static Semaphore semaforo2 = new Semaphore(20);
    
//    Aquí genero dos hilos que comparten el mismo semaforo1
    public static ProcesoLavado hilo1 = new ProcesoLavado(semaforo1, "Roberto");
    public static ProcesoLavado hilo2 = new ProcesoLavado(semaforo1, "Carolina");
    
//    Este es un semaforo, lo escribimos solo para explicar otra forma de añadirlos
    public static Semaphore semaforoMutex = new Semaphore(3);
    
    public static volatile int numero_ropas_lavadas = 0;
    
    
//    Denotamos que esta es el "public static principal", por decirlo de alguna forma
    public static void main(String[] args) {
        
        hilo1.start();
        hilo2.start();
    }
}
