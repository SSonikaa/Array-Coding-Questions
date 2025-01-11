import java.util.*;
class Max_min_value{
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
        System.out.println("Maximum element is " + arr[n-1]);
        System.out.println("Maximum element is " + arr[0]);
    }
}