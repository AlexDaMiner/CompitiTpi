/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani;

/**
 * Questa classe riceve il nome di uno dei 7 nani e lo stampa 7 volte
 * @author Alexander Dell'Oro
 */
public class ContaNani extends Thread {

    ContaNani(String nome) {
        super();
        setName(nome);
    }
    
    /**
     * Stampa 7 volte il nome del nano assegnato
     */
    public void run(){
        //System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 7; i++)
            System.out.println(i+1 + " " + getName());
        //System.out.println("Fine thread");
}
    
}
