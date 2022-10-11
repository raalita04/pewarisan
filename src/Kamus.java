
public class Kamus {
    String data[];
    String data1[];
    int jumData;
    
    public Kamus(String data[],String data1[], int jumData){
        this.jumData = jumData;
        this.data = new String[jumData];
        this.data1 = new String[jumData];
        for(int i=0;i<jumData;i++){
            this.data[i] = data[i].toLowerCase();
            this.data1[i] = data1[i].toLowerCase();
        }
    }
    
    public int find(String dicari){
        boolean ada = false;//belum ketemu atau tidak ada
        
        int bawah = 0;
        int atas = jumData - 1;
        int posisi = -1;
        
        while(atas >= bawah){
            int tengah = (atas + bawah)/2;
            int k = 0;
            if(dicari.toLowerCase().charAt(k) == data[tengah].charAt(k)){
                for(int x = 0; x < dicari.length(); x++){
                    if(dicari.toLowerCase().charAt(k) != data[tengah].charAt(k)){
                        break;
                    }
                    k++;
                }
            }
            if(dicari.toLowerCase().compareTo(data[tengah]) == 0){
                posisi = tengah;
                bawah = atas + 1;
            }
            else if(dicari.toLowerCase().charAt(k) > data[tengah].charAt(k)){
                bawah = tengah + 1;
            }
            else{
                atas = tengah - 1;
            }
        }
        return posisi;
    }
    
    public void display(){
        for(int i=0;i<jumData;i++){
            System.out.println(data[i]);
        }
    }
}
