package StudiKasus1a;

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
            System.out.println("2. Cetak data Karyawan terkini");
            System.out.println("3. Cetak Seluruh Karyawan");
            System.out.println("4. Cetak keryawan tertentu");
            System.out.println("0. Keluar Aplikasi");

            opsiMenu = scan.nextInt();
            scan.nextLine();

            if (opsiMenu == 1){
                karyawan.setData();
                listKaryawan.add(karyawan);
                index++;
            }
            else if(opsiMenu == 2){
                karyawan.print();
            }
            else if(opsiMenu == 3){
                for(int i=0;i<index;i++){
                    Karyawan dataKaryawan = listKaryawan.get(i);
                    dataKaryawan.print();
                }

            }
            else if (opsiMenu == 4) {
                System.out.println("Jumlah karyawan saat ini adalah "+index);
                System.out.print("Cetak karyawan ke-");
                int indexs = scan.nextInt();
                Karyawan dataKaryawan = listKaryawan.get(index-1);
                dataKaryawan.print();

            }


        } while(opsiMenu != 0);

    }
}
