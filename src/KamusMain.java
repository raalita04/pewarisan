import java.util.Scanner;

public class KamusMain {
    static String data[] = {"Langit", "Biru", "Awan", "Hujan", "Pelangi", "Cahaya", "Matahari", "Panas", "Dingin", "Lucu", "Kucing", "Kelinci"};
        static String data1[] = {"Sky", "Blue", "Cloud", "Rain", "Rainbow", "Light","Sun", "Hot", "Cool", "Cute", "Cat", "Rabbit"};
        
    public static void main(String[] args) {
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length -1 -i;j++){
                int k = 0;
                if(data[j].charAt(k) == data[j+1].charAt(k)){
                    k++;
                    for(int x = 0; x < data.length; x++){
                        if(data[j].charAt(k) != data[j+1].charAt(k)){
                            break;
                        }
                        k++;
                    }
                }
                if(data[j].charAt(k) > data[j+1].charAt(k)){
                    String b = data[j];
                    String c = data1[j];
                    data[j] = data[j+1];
                    data[j+1] = b;
                    data1[j] = data1[j+1];
                    data1[j+1] = c;
                }
            }
        }
        menuProgram();
    }
    
    public static void Indo(){
        Kamus Indo = new Kamus(data, data1, 12);

        String dicari = "Kucing";

        int posisi = Indo.find(dicari);

        if(posisi == -1){
            System.out.println("Data Tidak Ditemukan");
        }
        else{
            System.out.println(dicari + " dalam bahasa Inggris adalah " + data1[posisi]);
        }
    }
    
    public static void Eng(){
        Kamus Eng = new Kamus(data1, data, 12);

        String dicari = "Cloud";

        int posisi = Eng.find(dicari);

        if(posisi == -1){
            System.out.println("Data Not Found");
        }
        else{
            System.out.println(dicari + " in Indonesian is " + data[posisi]);
        }
    }
    
    public static void pilihMenu(int menu){
        if(menu == 1){
            Indo();
        }
        else if(menu == 2){
            Eng();
        }
        menuProgram();
    }
    public static void menuProgram(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu : ");
        System.out.println("1. Kamus Indonesia - Inggris");
        System.out.println("2. Kamus Inggris - Indonesia");
        System.out.print("Pilih Menu : ");
        int menu = sc.nextInt();
        pilihMenu(menu);
    }
}
