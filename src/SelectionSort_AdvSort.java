import java.util.Arrays;

public class SelectionSort_AdvSort {
    public static void main(String[] args) {
        int[] arr_nilai1 = {10,3,9,11,5,8,7,15};
        int[] arr_nilai2 = {55,85,70,25,78,100,90};
        goSort(arr_nilai1, "ASC");
        goSort(arr_nilai1, "DESC");
        goSort(arr_nilai2, "ASC");
        goSort(arr_nilai2, "DESC");
        
    }

    static void goSort(int[] data_arr, String optionSort){
        int arr[] = data_arr.clone();
        int minOrMax = arr[0];
        int index = 0;
        int prosesSwap = 0;

        long startTime = System.nanoTime();
        if(optionSort == "ASC"){
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i; j < arr.length; j++) {
    
                    if(minOrMax > arr[j]){
                        minOrMax = arr[j];
                        index = j;
                    }

                }
    
                if(arr[i] > minOrMax){
                    arr[index] = arr[i];
                    arr[i] = minOrMax;
                    prosesSwap++;
                }
    
                minOrMax = arr[i + 1];
            }
        }

        if(optionSort == "DESC"){
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i; j < arr.length; j++) {
    
                    if(minOrMax < arr[j]){
                        minOrMax = arr[j];
                        index = j;
                    }

                }
    
                if(arr[i] < minOrMax){
                    arr[index] = arr[i];
                    arr[i] = minOrMax;
                    prosesSwap++;
                }
    
                minOrMax = arr[i + 1];
        }
    }
        long endTime = System.nanoTime();
        System.out.println("Hasil Array " +  Arrays.toString(arr));
        System.out.println("Data Yang Dibutuhkan " + (endTime - startTime) / 1000000.0 + " seconds");
        System.out.println(prosesSwap + " Swap dilakukan \n");
    }
    static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
}
