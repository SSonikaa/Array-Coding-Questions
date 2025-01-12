import java.util.Scanner;
class ReverseArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter your array elements");
        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int temp =0;
        int k=n-1;
        int j = 0;
            while(j < k )
           {temp =  arr[j];
           arr[j] = arr[k];
           arr[k] = temp; 
           j++;
           k--;
          
        }
            
        
        for(int i = 0 ; i< arr.length ; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
