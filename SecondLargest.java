import java.util.*;
public class SecondLargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter your array elements");
        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second largest element is " + arr[n-2]);
    
        sc.close();
    }
}
