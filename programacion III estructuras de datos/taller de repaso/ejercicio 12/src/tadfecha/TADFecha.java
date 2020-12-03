/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadfecha;

/**
 *
 * @author Pepe
 */
public class TADFecha {
    int dia;
    int mes;
    int ano;
    int hora;
    int minutos;
    int segundos;

    public TADFecha(int dia, int mes, int ano, int hora, int minutos, int segundos) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public TADFecha() {
    }

    public void crear(TADFecha tfecha){
        this.dia = tfecha.dia;
        this.mes = tfecha.mes;
        this.ano = tfecha.ano;
        this.hora = tfecha.hora;
        this.minutos = tfecha.minutos;
        this.segundos = tfecha.segundos;        
    }
    
    public boolean comparar(TADFecha tfecha){
        if(dia == tfecha.dia && mes == tfecha.mes && ano == tfecha.ano && hora == tfecha.hora && minutos == tfecha.minutos && segundos == tfecha.segundos){
            return true;
        }
        return false;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
}
