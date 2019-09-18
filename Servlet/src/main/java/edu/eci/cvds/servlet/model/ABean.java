/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.servlet.model;

import java.io.Serializable;
import java.util.Random;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author 2146516
 */
@ManagedBean(name="ABean")
@ApplicationScoped
public class ABean{
   private Random r = new Random();
   private int numeroAdivinar;
   private int premio;
   private int numeroIntentos=0;
   private int numeroActual =0;
   private String ganador;
   public ABean(){
       this.numeroAdivinar = r.nextInt();
       this.premio = 100000;
       this.numeroIntentos = 0;
       ganador = "Aun no ha ganado el juego.";
   }
   public int getNumeroAdivinar(){
       return numeroAdivinar;
   }
   public void setNumeroAdivinar(int numeroAdivinar){
       this.numeroAdivinar = numeroAdivinar;
   }
   public int getPremio(){
       return premio;
   }
   public void setPremio(int premio){
       this.premio = premio;
   }
   public int getNumeroIntentos(){
       return numeroIntentos;
   }
   public void setNumeroIntentos(int numeroIntentos){
       this.numeroIntentos = numeroIntentos;
   }
   public String getGanador(){
       return ganador;
   }
   public void setGanador(String ganador){
       this.ganador = ganador;
   }
   public void guess(int intento){
       numeroIntentos +=1;
       if (intento!=numeroAdivinar & premio>0){
           premio -= 10000; 
       }
       else if (intento==numeroAdivinar & premio<=0){
           setGanador("Adivinaste el numero pero quedaste sin premio.");
       }
       else if(intento==numeroAdivinar & premio>=0){
           setGanador("Ganaste, tu premio es: "+premio+".");
       }
       
   }
   public void reStart(){
       numeroAdivinar = r.nextInt(30);
       premio = 100000;
   }
   
   
}
