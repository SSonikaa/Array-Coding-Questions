import java.util.Scanner;
public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size");
        int na = sc.nextInt();
        System.out.println("Enter second array size");
        int nb = sc.nextInt();
        int [] a = new int [na];
        int [] b = new int [nb];
        System.out.println("Enter your first array elements");
        for(int i = 0 ; i< a.length ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter your second array elements");
        for(int i = 0 ; i< b.length ; i++){
            b[i] = sc.nextInt();
        }
        int merge[] = new int[na+nb];
        int i=0, j=0, k=0;
        while(i < na && j < nb){
            if(a[i]< b[j]){
                merge[k++]= a[i++];
            }else{
                merge[k++] = b[j++];
            }
        }
        while(i< na){
            merge[k++]  = a[i++];
        }

        while(j< nb){
            merge[k++]  = b[j++];
        }


        for(int z =0; z< na+nb ; z++){
            System.out.println(merge[z]);
        }
        sc.close();
    }
}
