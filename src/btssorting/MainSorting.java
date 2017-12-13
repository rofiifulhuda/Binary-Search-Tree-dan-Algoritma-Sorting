/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btssorting;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rofiif
 */
public class MainSorting {
    public static void main(){
        Sorting ST = new Sorting();
        Random y = new Random();
        Scanner a = new Scanner(System.in);
        int jumlah;
        System.out.println("Masukkan jumlah angka ");
        jumlah = a.nextInt();
        int [] hasil = new int[jumlah];
        for(int i = 1; i <= jumlah; i++){
            hasil[i-1] = 1 + y.nextInt(9);
            System.out.printf("%d ", hasil[i-1]);
            if (i % 10 == 0 ){
                System.out.println();
            }
        }
        System.out.println("");
        System.out.println("1. Selection");
        System.out.println("2. Insertion");
        System.out.println("3. Bubble");
        System.out.println("4. Merge");
        System.out.println("Pilih metode pengurutan data");
        int pilih = a.nextInt();
        if(pilih == 1){
            ST.selection(hasil);
            ST.printArray(hasil);
        }
        else if(pilih == 2){
            ST.insertion(hasil);
            ST.printArray(hasil);
        }
        else if(pilih == 3){
            ST.bubble(hasil);
            ST.printArray(hasil);
        }
        else if(pilih == 4){
            ST.sort(hasil, 0, hasil.length-1);
            ST.printArray(hasil);
        }
        else{
            System.out.println("pilihan anda salah");
        }

    }
            
}
