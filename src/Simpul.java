
public class Simpul {
    String nim;
    String nama;
    int nilai;
    Simpul berikutnya;

    public Simpul(String xnim, String xnama, int xnilai){
        nim = xnim;
        nama = xnama;
        nilai = xnilai;
        berikutnya = null;
    }

    public void infoData(){
        System.out.println("NIM : " + nim);
        System.out.println("NAMA : " + nama);
        System.out.println("NILAI : " + nilai);
        System.out.println("Pointer Next " + berikutnya);
        System.out.println("---------------------------------");
    }
    
}
