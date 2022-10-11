
public class Soal1 {
    public static void main(String[] args) {
    String kalimat = "Kampus Saya Universitas Nusa putra ";
    kalimat += " ";
    String hasil = "";
    for (int i = 0; i < kalimat.length(); i++) {
        if(kalimat.charAt(i) == ' '){
            for (int j = i - 1; j >= 0; j--) {
                if(kalimat.charAt(j) == ' '){
                    break;
                }
                hasil += kalimat.charAt(j);
            }
            hasil += " ";
        }
    }
    System.out.println(hasil);
        
    }

    
}
