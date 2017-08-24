/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancoinvestimentos;

/**
 *
 * @author aluno
 */
public class Conta {

    /**
     * @return the limite
     */
    public float getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(float limite) {
        this.limite = limite;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @return the angecia
     */
    public int getAngecia() {
        return angecia;
    }

    /**
     * @param angecia the angecia to set
     */
    public void setAngecia(int angecia) {
        this.angecia = angecia;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    private int numero;
    private int angecia;
    private float saldo;
    private float limite;
    
}
