/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DinDonDan;

/**
 * Questo programma avvia 3 diversi thread che faranno avviare 3 diverse
 * istanze di campane e le farà suonare parallelamente e indipendentemente
 * @author Alexander Dell'Oro
 * 
 */
public class DinDonDan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable cam1 = new Campana("din", 5);
        Thread thr1 = new Thread(cam1);
        thr1.start();
        Thread thr2 = new Thread(new Campana("don", 5));
        thr2.start();
        new Thread(new Campana("dan", 5)).start();
    }
    
}
