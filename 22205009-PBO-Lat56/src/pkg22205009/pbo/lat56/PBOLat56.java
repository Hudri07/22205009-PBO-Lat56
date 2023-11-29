package pkg22205009.pbo.lat56;

/**
 * Nama : Asmalik Hudri 
 * Prodi : Teknik Informatika 
 * Semester : 3 
 * Matakuliah :Pemrograman Berorientasi Objek (PBO)
 */

// Kelas dasar yang mempresentasikan barang antik
class BarangAntik {

    protected int umur; //Variabel untuk menyimpan umur dari barang antik

    // Konstruktor untuk membuat objek Barang antik dengan menginisialisasi propertinya
    public BarangAntik(int umur) {
        this.umur = umur;
    }

    public void tampilUmur() {
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun.");
    }
}

// Kelas turunan dari kelas Barang antik, menambahkan variable name
class Radio extends BarangAntik {

    private String name;    //Variabel untuk menyimpan nama 
   
    // Konstruktor untuk kelas Radio yang memanggil konstruktor kelas Barang antik menggunakan "super"
    public Radio(int umur) {
        super(umur);
    }

    // Method Getter untuk mendapatkan nama 
    public String getName() {
        return name;
    }
    
    // Method Setter untuk mengatur nama
    public void setName(String name){
        this.name = name;
    }
}

// kelas utama yang berisi method main untuk menjalankan program
public class PBOLat56{
    
    public static void main(String[] args) {
        //Membuat objek radio  
        Radio o = new Radio (234);
        // Mengeset nama barang antik menggunakan metode setName dari objek o
        o.setName("Radio AM");
        
        // Menampilkan informasi nama barang antik yang telah diatur
        System.out.println("Nama barang Antik: " + o.getName());

        // Memanggil metode tampilUmur dari objek o untuk menampilkan umur barang antik
        o.tampilUmur();
    }
}