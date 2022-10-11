import java.util.Arrays;
public class SelectionSortSoal4 {
     public static void main(String[] args) {
        String[] kota = {"Malang","Surabaya","Bandung","Aceh","Garut"};
        sort(kota);
    }

    static void sort(String data[]){
        String temp = data[0];
        int index = 0;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i; j < data.length; j++) {
                if(temp.charAt(0) > data[j].charAt(0)){
                    temp = data[j];
                    index = j;
                }
            }

            if(data[i].charAt(0) > temp.charAt(0)){
                data[index] = data[i];
                data[i] = temp;
            }
            temp = data[i + 1];
        }
        System.out.println(Arrays.toString(data));

    }
}
