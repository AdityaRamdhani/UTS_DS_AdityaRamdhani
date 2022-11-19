/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MODERN14
 */
public class Nomber3 {
    public static void main(String[] args) {

        List<Mahasiswa> MahasiswaList = new ArrayList<>();
        MahasiswaList.add(new Mahasiswa(1245, "Rizki M Akmal", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(1274, "William Pradana P", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(1345, "Joo Muamar", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(1647, "Deni Ardiansyah", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(1523, "M Fikri Deniansyah", "TIFRM22A", 191122));

        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + MahasiswaList.size());
        MahasiswaList.remove(0);

        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + MahasiswaList.size()); 
    }

}


