/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani;

/**
 * Questo programma stampa il nome dei famosissimi 7 nani, 7 volte per ognuno
 * @author Alexander Dell'Oro
 */
public class Nani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        ContaNani thr1 = new ContaNani("brontolo");
        ContaNani thr2 = new ContaNani("mammolo");
        ContaNani thr3 = new ContaNani("pisolo");
        ContaNani thr4 = new ContaNani("dotto");
        ContaNani thr5 = new ContaNani("eolo");
        ContaNani thr6 = new ContaNani("cucciolo");
        ContaNani thr7 = new ContaNani("gongolo");
        thr1.start();
        Thread.sleep(1000);
        thr2.start();
        Thread.sleep(1000); 
        thr3.start();
        Thread.sleep(1000);
        thr4.start();
        Thread.sleep(1000);
        thr5.start();
        Thread.sleep(1000);
        thr6.start();
        Thread.sleep(1000);
        thr7.start();
        //System.out.println(Thread.currentThread().getName());
    }
    
}
