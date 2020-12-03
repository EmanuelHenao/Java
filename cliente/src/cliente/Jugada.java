/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.Serializable;

/**
 *
 * @author ELVIRA
 */
public class Jugada implements Serializable{
   private int fila;
   private int columna;
   private String Jugador;
   private String oponente;

    public Jugada() {
    }

    public Jugada(int fila, int columna, String Jugador, String oponente) {
        this.fila = fila;
        this.columna = columna;
        this.Jugador = Jugador;
        this.oponente = oponente;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * @return the Jugador
     */
    public String getJugador() {
        return Jugador;
    }

    /**
     * @param Jugador the Jugador to set
     */
    public void setJugador(String Jugador) {
        this.Jugador = Jugador;
    }

    /**
     * @return the oponente
     */
    public String getOponente() {
        return oponente;
    }

    /**
     * @param oponente the oponente to set
     */
    public void setOponente(String oponente) {
        this.oponente = oponente;
    }
   
    
}
