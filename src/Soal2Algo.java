
public class Soal2Algo {
     public static void main(String[] args) throws Exception {
        sensor("Kelakuan Anak Itu Sangat Bangsat Sekali","Bangsat",'$');
    }

    static void sensor(String kalimat, String kalimat_sensor, char sensor){
        boolean match;
        String hasil = "";
        kalimat += " ";
        for(int i = 0; i < kalimat.length(); i++){
            int j = 0;
            match = false;
            if(kalimat.charAt(i) == kalimat_sensor.charAt(0)){
                match = true;
                for(j = 0 ; j < kalimat_sensor.length();j++){
                    if(j + i == kalimat.length() - 1 && kalimat.charAt(j) != kalimat_sensor.charAt(j)){
                        match = false;
                        break;
                    }
                    
                    if(kalimat.charAt(i + j) != kalimat_sensor.charAt(j)){
                        match = false;
                        break;
                    }
                }
            }
            if(match){
                for (int x = 0; x < kalimat_sensor.length();x++) {
                    hasil += sensor;
                    
                }
                hasil += " ";
                i = i + j - 1;
            }

            if(!match){
                hasil += kalimat.charAt(i);
            }
        }
        System.out.println(hasil);

    }
    
}
