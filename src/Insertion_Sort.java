
public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {8,3,5,1,6};

        //Sorting
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            int k = i;
            while(k > 0 && arr[k - 1] > temp){
                arr[k] = arr[k - 1];
                k--;
            }
            arr[k] = temp;
            info(arr);
            System.out.println();
        }

        info(arr);
        
    }

    static void info(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
