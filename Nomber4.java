/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author MODERN14
 */
public class Nomber4 {
    public static void main(String[] args) {
        LinkedList<Mahasiswa> MahasiswaList = new LinkedList<>();
        MahasiswaList.add(new Mahasiswa(1245, "Rizki M Akmal", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(1274, "William Pradana P", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(1345, "Joo Muamar", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(1647, "Deni Ardiansyah", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(1523, "M Fikri Deniansyah", "TIFRM22A", 191122));
        
        Scanner valueId = new Scanner(System.in);
        Scanner valueName = new Scanner(System.in);
        Scanner valueKelas = new Scanner(System.in);
        Scanner valueTanggal = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        System.out.println("Masukan Data Mahasiswa Untuk Ditambahkan");
        System.out.print("Masukan Id Mahasiswa : ");
        int id = valueId.nextInt();
        System.out.print("Masukan Nama Mahasiswa : ");
        String name = valueName.nextLine();
        System.out.print("Masukan Kelas Mahasiswa : ");
        String kelas = valueKelas.nextLine();
        System.out.print("Masukan Tanggal : ");
        int tanggal = valueTanggal.nextInt();

        MahasiswaList.add(new Mahasiswa(id, name, kelas, tanggal));

        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));

        System.out.println("Masukan Data Mahasiswa Untuk Dihapus");
        System.out.print("Masukan Nama Mahasiswa : ");
        String nameRemove = value.nextLine();
        MahasiswaList.removeIf(Mahasiswa -> Mahasiswa.getName().contains(nameRemove));
        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));

    }

}

