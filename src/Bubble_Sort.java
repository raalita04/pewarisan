
public class Bubble_Sort {
    public static void main(String[] args) {
        String[] arr = {"Semarang", "Malang", "Jakarta", "Cianjur", "Bogor", "Denpasar"};

        //Lakukan Sorting
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j].charAt(0) < arr[j + 1].charAt(0)){
                    String tampung = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tampung;
                }
            }
        }

        print(arr);
    }

    static void print(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
