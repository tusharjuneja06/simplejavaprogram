import java.util.Scanner;
public class selectionSort {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter number of elements to be added");
        n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        int minIndex=0;
        System.out.println("Enter integer");
        for(int i = 0;i<arr.length;i++)
            arr[i]= new Scanner(System.in).nextInt();

        for(int i = 0; i<arr.length-1;i++){
            minIndex = i;
            for(int  j= i;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        return;
    }
    
}
