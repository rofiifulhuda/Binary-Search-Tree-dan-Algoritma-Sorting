/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btssorting;

/**
 *
 * @author Rofiif
 */
public class MainBTS {
    public static void main(String[] args) {
        BinarySearchTree y = new BinarySearchTree();
        y.put(1, 'a');
        y.put(6, 'c');
        y.put(4, 'b');
        y.put(8, 'd');
        System.out.println("element diurutkan dari yang paling kecil");
        y.ascend();
        System.out.println();
        
        System.out.println("get element d");
        System.out.println(y.get(8));
        System.out.println();
        
    }
    }
           

