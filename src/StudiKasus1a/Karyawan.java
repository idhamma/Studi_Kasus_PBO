package StudiKasus1a;

import java.util.Scanner;

public class Karyawan {

    private String nama;
    private String alamat;
    private String noTelp;
    private String jk;
    private String Kategori;
    private String umur;
    private String jabatan;
    private String gaji;
    private String tanggalLahir;
    private String email;
    private String statusPernikahan;
    private String pendidikan;
    private String id;

    Scanner scan = new Scanner(System.in);
    Karyawan(){

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
        nama = scan.nextLine();
        System.out.print("Alamat\t\t\t\t:");
        alamat = scan.nextLine();
        System.out.print("No Telepon\t\t\t:");
        noTelp = scan.nextLine();
        System.out.print("Jenis Kelamin\t\t:");
        jk = scan.nextLine();
        System.out.print("Umur\t\t\t\t:");
        umur = scan.nextLine();
        System.out.print("Jabatan\t\t\t\t:");
        jabatan = scan.nextLine();
        System.out.print("Gaji\t\t\t\t:");
        gaji = scan.nextLine();
        System.out.print("Tanggal lahir\t\t:");
        tanggalLahir = scan.nextLine();
        System.out.print("Email\t\t\t\t:");
        email = scan.nextLine();
        System.out.print("Status Pernikahan\t:");
        statusPernikahan = scan.nextLine();
        System.out.print("Pendidikan\t\t\t:");
        pendidikan = scan.nextLine();
        System.out.print("ID\t\t\t\t\t:");
        id = scan.nextLine();
    }

    public void print(){
        System.out.println("======================================");
        System.out.println("Nama\t\t\t\t:"+nama);
        System.out.println("Alamat\t\t\t\t:"+alamat);
        System.out.println("No Telepon\t\t\t:"+noTelp);
        System.out.println("Jenis Kelamin\t\t:"+jk);
        System.out.println("Umur\t\t\t\t:"+umur);
        System.out.println("Jabatan\t\t\t\t:"+jabatan);
        System.out.println("Gaji\t\t\t\t:"+gaji);
        System.out.println("Tanggal lahir\t\t:"+tanggalLahir);
        System.out.println("Email\t\t\t\t:"+email);
        System.out.println("Status Pernikahan\t:"+statusPernikahan);
        System.out.println("Pendidikan\t\t\t:"+pendidikan);
        System.out.println("ID\t\t\t\t\t:"+id);
        System.out.println("======================================");
    }
}
