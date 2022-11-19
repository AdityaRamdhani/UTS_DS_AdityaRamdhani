/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author MODERN14
 */
public class Nomber1 {
    
    public static void main(String[] args) {
        
        int angka [] = {50, 52, 62, 83, 92, 94, 100, 104, 120, 157, 189, 258, 277, 289, 300};
    
    System.out.println ("\t Angka Ganjil & Genap \n");
    
    System.out.println("====================================================== \n");
    
    System.out.print("\n Angka Genap :");
    for (int i = 0; i < 15; i++) {
        if (angka[i] %2 == 0){
            System.out.print(angka[i] + ", ");
        }
    }    
       System.out.print("\n Angka Ganjil :");
    for (int j = 0; j < 15; j++) {
        if (angka[j] %2 != 0){
            System.out.print(angka[j] + ", ");
        }
     }   
    }
}


