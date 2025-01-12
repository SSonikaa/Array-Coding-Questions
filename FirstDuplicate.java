import java.util.Scanner;
public class FirstDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter your array elements");
        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0 ;i < n ;i++){
            if(count != 0){ break;}
            int temp = arr[i];
            
            for(int j= i+1 ;j< n ;j++){
                if (temp == arr[j]){
                    count ++;
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
        if(count==0){System.out.println("No duplicates were found");}
        sc.close();
    }
}
