/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import com.mycompany.prepa_2.Prepa_2;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hallo
 */
public class ProcesoLavado extends Thread{
    public boolean keep = true;
    public Semaphore semaforoMain;
    public String nameUser;
    
    /**
     *
     * @param semaforo1
     * @param nameUser
     */
    public ProcesoLavado(Semaphore semaforo1, String nameUser){ 
        this.semaforoMain = semaforo1;
        this.nameUser = nameUser;
    }
    
    //
    @Override
    public void run(){
        try {
                        
            while(keep){
                this.semaforoMain.acquire();
//                Prepa_2.semaforoMutex.acquire();
                Prepa_2.numero_ropas_lavadas++;
                System.out.println( "Lo lava: "+ this.nameUser + ". número lavado: " + Prepa_2.numero_ropas_lavadas + " con un lavado time: " + this.semaforoMain);
                Thread.sleep(1000);
                
//                if(this.semaforoMain.getQueueLength() == 0){
//                    keep = false;
//                }
                
//                System.out.println("Numero de ropas lavadas: " + Prepa_2.numero_ropas_lavadas);
            }
            
//        for (int i = 0; i <= 5; i++){
//        System.out.println("Step "+i+ " Hecho por: " + this.nombre);
//        }    
        } catch (InterruptedException ex) {
            Logger.getLogger(ProcesoLavado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
//    public void setParamName(String nuevo_nombre){
//        this.nombre = nuevo_nombre;            
//    }
//    
//    public void shift_sleep(){
//        this.until = !until;
//    }
}
