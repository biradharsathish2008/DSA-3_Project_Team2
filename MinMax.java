import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int idx1 = 0;
        int idx2 = 0;

        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
                idx1 = i;
            }
            
            if(arr[i] > max){
                max = arr[i];
                idx2 = i;
            }
        }
        System.out.println("Minimum : " + min + " at index " + idx1 +  " , Maximum : "+ max + " at index " + idx2);
    }
}
