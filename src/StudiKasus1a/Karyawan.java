package StudiKasus1a;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Karyawan {

    private String nama;
    private String alamat;
    private String noTelp;
    private String jk;
    private String Kategori;
    private String umur;
    private String jabatan;
    private int gajiDefault = 3100000;
    //default gaji berdasarkan UMK Kota Malang

    private String gaji;
    private String tanggalLahir;
    private String email;
    private String statusPernikahan;
    private String pendidikan;
    private String id;
    NumberFormat separator = NumberFormat.getNumberInstance(Locale.GERMANY); // berfungsi untuk memberikan separator/pemisah diantara satuan ribuan


    Scanner scan = new Scanner(System.in);
    public Karyawan(){

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getKategori() {
        return Kategori;
    }

    public void setKategori(String kategori) {
        Kategori = kategori;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getGaji() {
        gaji = separator.format(gajiDefault);
        return gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatusPernikahan() {
        return statusPernikahan;
    }

    public void setStatusPernikahan(String statusPernikahan) {
        this.statusPernikahan = statusPernikahan;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setData(){
        System.out.print("Nama\t\t\t\t:");
        this.nama = scan.nextLine();
        System.out.print("Alamat\t\t\t\t:");
        this.alamat = scan.nextLine();
        System.out.print("No Telepon\t\t\t:");
        this.noTelp = scan.nextLine();
        System.out.print("Jenis Kelamin\t\t:");
        this.jk = scan.nextLine();
        System.out.print("Umur\t\t\t\t:");
        this.umur = scan.nextLine();
        System.out.println("Jabatan\t\t\t\t:");
        this.jabatan = listPekerjaan();
        System.out.print("Tanggal lahir\t\t:");
        this.tanggalLahir = scan.nextLine();
        System.out.print("Email\t\t\t\t:");
        this.email = scan.nextLine();
        System.out.print("Status Pernikahan\t:");
        this.statusPernikahan = scan.nextLine();
        System.out.print("Pendidikan\t\t\t:");
        this.pendidikan = scan.nextLine();
        System.out.print("ID\t\t\t\t\t:");
        this.id = scan.nextLine();
    }

    public void print(){
        System.out.println("======================================");
        System.out.println("Nama\t\t\t\t:"+nama);
        System.out.println("Alamat\t\t\t\t:"+alamat);
        System.out.println("No Telepon\t\t\t:"+noTelp);
        System.out.println("Jenis Kelamin\t\t:"+jk);
        System.out.println("Umur\t\t\t\t:"+umur);
        System.out.println("Jabatan\t\t\t\t:"+jabatan);
        System.out.printf("Gaji\t\t\t\t:Rp%s,-\n",gaji);
        System.out.println("Tanggal lahir\t\t:"+tanggalLahir);
        System.out.println("Email\t\t\t\t:"+email);
        System.out.println("Status Pernikahan\t:"+statusPernikahan);
        System.out.println("Pendidikan\t\t\t:"+pendidikan);
        System.out.println("ID\t\t\t\t\t:"+id);
        System.out.println("======================================");
    }
    String hitungGaji(String jabatan){
        if (jabatan.equals("Dokter Hewan")){
            gajiDefault*=3;
        }
        else if (jabatan.equals("Admin")){
            gajiDefault*=1.7;
        }
        else if (jabatan.equals("Groomer")){
            gajiDefault*=1.3;
        }
        gaji = separator.format(gajiDefault);
        return gaji;
    }

    //method listPekerjaan dibuat karena macam-macam dari pekerjaan sudah ditentukan dan tidak boleh ditambah/dikurangi lagi
    public String listPekerjaan(){
        String jabatan=null;
        int opsiJabatan=0;
        System.out.println("Pilih jabatan dibawah ini");
        System.out.println("            1. Dokter Hewan");
        System.out.println("            2. Admin");
        System.out.println("            3. Groomer");
        do {
            System.out.print("Opsi pekerjaan\t\t:");
            opsiJabatan = scan.nextInt();
            scan.nextLine();

            if (opsiJabatan == 1) {
                jabatan = "Dokter Hewan";
            } if (opsiJabatan == 2) {
                jabatan = "Admin";
            } if (opsiJabatan==3){
                jabatan = "Groomer";
            }
            if (opsiJabatan!=1 && opsiJabatan!=2 && opsiJabatan!=3){
                System.out.println("opsi pilihan tidak ada, silahkan input kembali sesuai opsi");
            } else {
                System.out.println(jabatan);
                this.gaji = hitungGaji(jabatan);
            }
        }while (opsiJabatan!=1 && opsiJabatan!=2 && opsiJabatan!=3);

        return jabatan;
    }
}