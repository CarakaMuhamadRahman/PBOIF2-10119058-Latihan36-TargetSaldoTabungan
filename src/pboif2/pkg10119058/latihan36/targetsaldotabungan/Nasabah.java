/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan36.targetsaldotabungan;

/**
 *
 * @author 
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung target saldo
 *                     tabungan.
 */
public class Nasabah {
   public double bunga,total,totalBunga;
   public int targetSaldo,i,saldoAwal;
    
   public void menghitungTabungan() {
        saldoAwal = 3500000;
        bunga   = 0.08;
        targetSaldo = 6000000;
        i = 1;
        
        do {
            totalBunga = saldoAwal*bunga;
            total      = totalBunga+saldoAwal;
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %,1.0f%n ", + total);
            saldoAwal += totalBunga;
            i++;
        }while (total <= targetSaldo);
    }
    
}
