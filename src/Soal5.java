
public class Soal5 {
    public static void Tambahkata(String kalimat, int Indexganti, String kataganti){
    int jmlkata = 0;
    String katakiri = "", katakanan = "";
    for (int i = 0; i < kalimat.length(); i++) {

        if (kalimat.charAt(i) == ' ') {
            jmlkata++;}

        if (jmlkata < Indexganti) {
            katakiri = katakiri +kalimat.charAt(i);
            }
        else{
            katakanan = katakanan+= kalimat.charAt(i);}
        }

        System.out.println(katakiri+" "+kataganti+katakanan);


}

public static void main(String[] args) {
    Tambahkata("Saya sedang belajar struktur data", 2,"pergi" );
    Tambahkata("Pemrograman itu sangat mudah", 4,"dan menyenangkan");
}
    
}
