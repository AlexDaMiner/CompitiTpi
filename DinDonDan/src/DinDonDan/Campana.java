/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DinDonDan;

/**
 * questa classe rappresenta una campana, che dovrà suonare un determinato
 * numero di volte prestabilito ed emettere il suonmo assegnato ad esso
 * @author Alexander Dell'Oro
 * 
 */
public class Campana implements Runnable {
    String suono;
    int volte;
    /**
     * 
     * @param suono il suono che la campana deve emettere
     * @param volte il numero di volte che la campana suonerà
     */
    public Campana(String suono, int volte){
        this.suono = suono;
        this.volte = volte;
    }
    /**
     * fa suonare la campana il numero di volte prestabilito e gli fa emettere
     * il suono deciso
     */
    public void run(){
        for (int k = 0; k < volte; k++){
            System.out.println((k+1)+suono+" ");
        }
    }
}
