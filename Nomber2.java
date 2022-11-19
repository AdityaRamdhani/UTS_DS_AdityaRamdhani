/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author MODERN14
 */
public class Nomber2 {
  public static void main(String[] args) {
        int[] angka = new int[10];
        Scanner valueArray = new Scanner(System.in);

        System.out.println("Masukan Isi Array ");

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukan index ke-" + (i + 1) + " : ");
            angka[i] = valueArray.nextInt();
        }
        sort(angka);
        System.out.println("Isi Arraay : " + Arrays.toString(angka));
    }

    static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

}

