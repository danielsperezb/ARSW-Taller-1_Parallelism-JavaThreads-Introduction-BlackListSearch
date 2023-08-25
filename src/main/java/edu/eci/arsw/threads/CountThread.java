/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread {

    private final int rangoInicial;
    private final int rangoFinal;

    CountThread(int rangoInicial, int rangoFinal){
        this.rangoInicial = rangoInicial;
        this.rangoFinal = rangoFinal;
    }

    @Override
    public void run() {
        System.out.println("Este es el hilo que se está ejecutando: "+ Thread.currentThread().getName());
        for (int i = rangoInicial; i < rangoFinal; i++){
            System.out.println(i);
        }
    }
}

