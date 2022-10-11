import java.util.Scanner;
public class Stack {
    private final int MAX_LAGU = 10;
    private String[] tumpukan_lagu = new String[MAX_LAGU];
    private int teratas;
    
    public Stack(){
        teratas = 0;
        clear();
    }

    public boolean push(String lagu){
        if(teratas == MAX_LAGU){
            System.out.println("Data Sudah Penuh");
            return false;
        }
        else{
            teratas++;
            tumpukan_lagu[MAX_LAGU - teratas] = lagu;
            return true;
        }
    }

    public boolean isEmpty(){
        return teratas == 0;
    }

    public String pop(){
        String lagu = null;
        if(!isEmpty()){
            for(int i = 0; i < tumpukan_lagu.length; i++){
                if(tumpukan_lagu[i] != null){
                    lagu = tumpukan_lagu[i];
                    tumpukan_lagu[i] = null;
                    break;
                }
            }
            teratas--;
            return lagu;
        }
        else{
            System.out.println("data sudah kosong");
            return null;
        }
    }

    public void infoStack(){
        for (int i = 0; i < tumpukan_lagu.length; i++) {
            if(tumpukan_lagu[i] != null){
                System.out.println(tumpukan_lagu[i]);
            }
        }
    }

    public void clear(){
        for(int i = 0; i < tumpukan_lagu.length; i++){
            tumpukan_lagu[i] = null;
        }
        teratas = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack playlist = new Stack();

        while(true){
            menu();
            int x = sc.nextInt();

            if(x == 1){
                playlist.infoStack();
            }
            else if(x == 2){
                System.out.print("nama lagu: ");
                String tambahLagu = sc.next();
                playlist.push(tambahLagu);
            }
            else if(x == 3){
                playlist.pop();
            }
            else if(x == 4){
                playlist.clear();
            }
            else if(x == 5){
                break;
            }
        }
        
    }

    static void menu(){
        System.out.println("1. Tampilkan Data");
        System.out.println("2. Masukan Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Hapus Semua Data");
        System.out.println("5. Keluar Program");
        System.out.println("--------------------------");
        System.out.print("pilih 1-5: ");

    }
    
}
