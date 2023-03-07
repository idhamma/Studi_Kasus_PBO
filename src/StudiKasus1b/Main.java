package StudiKasus1b;

import StudiKasus1a.Karyawan;

import java.util.*;

public class Main {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Karyawan> listKaryawan = new ArrayList<>();
        Karyawan karyawan = new Karyawan();

        int opsiMenu;
        int index=0;

        //Menu utama Aplikasi
        do {
            System.out.println("Pet-House");
            System.out.println("Menu");
            System.out.println("1. Isi data Karyawan");
            System.out.println("2. Cetak data Karyawan terbaru");
            System.out.println("3. Cetak Seluruh Karyawan");
            System.out.println("4. Cetak karyawan tertentu");
            System.out.println("0. Keluar Aplikasi");

            opsiMenu = scan.nextInt();
            scan.nextLine();
            //opsi menu 1 : untuk mengisi data karyawan
            if (opsiMenu == 1){
                karyawan.setData();
                listKaryawan.add(karyawan);
                index++;
            }
            // opsi menu 2 : untuk mencetak karyawan yang baru saja ditambahkan kedalam aplikasi
            else if(opsiMenu == 2){
                if (index != 0) {
                    karyawan.print();
                } else {
                    System.out.println("\n---Tidak ada data karyawan yang tersimpan, silahkan input data terlebih dahulu---");
                }
            }
            //opsi menu 3 : untuk mencentak seluruh data karyawan yang ada dalam aplikasi
            else if(opsiMenu == 3){
                if (index != 0) {
                    for (int i = 0; i < index; i++) {
                        Karyawan dataKaryawan = listKaryawan.get(i);
                        dataKaryawan.print();
                    }
                } else {
                    System.out.println("\n---Tidak ada data karyawan yang tersimpan, silahkan input data terlebih dahulu---");
                }
            }
            //opsi menu 4 : untuk mencetak keryawan tertentu
            else if (opsiMenu == 4) {
                if (index != 0) {
                    System.out.println("Jumlah karyawan saat ini adalah " + index);
                    System.out.print("Cetak karyawan ke-");
                    int indexs = scan.nextInt();
                    Karyawan dataKaryawan = listKaryawan.get(index - 1);
                    dataKaryawan.print();
                } else {
                    System.out.println("\n---Tidak ada data karyawan yang tersimpan, silahkan input data terlebih dahulu---");
                }
            }
            System.out.println("");
        } while(opsiMenu != 0);

    }
}