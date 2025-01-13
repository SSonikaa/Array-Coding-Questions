import java.util.Arrays;
import java.util.Scanner;
public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size");
        int n = sc.nextInt();
        int [] arr = new int [n];
        int [] copyarr = new int [n];
        System.out.println("Enter your array elements");
        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
            copyarr[i] = arr[i];
        }
        Arrays.sort(arr);
        int count =0;
        for(int j = 0 ; j< n ;j++){
            if(copyarr[j] != arr[j]){
                count =1 ;
                break;
            }   
        }
        if (count == 1 ){ System.out.println("The array is not sorted");}
        else { System.out.println("The array is.? sorted");}
    
        sc.close();
}
}