import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    
    public int[] acceptArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] arr = ls.acceptArray();
        
        System.out.println("The elements of the array are: " + Arrays.toString(arr));
    }
}
