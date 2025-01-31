import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int s = sc.nextInt();
        int[] arr = new int[s];

        int i;
        for(i = 0; i < arr.length; ++i) {
            System.out.print("enter a " + i + " index value : ");
            int num = sc.nextInt();
            sc.nextLine();
            arr[i] = num;
        }

        for(i = 0; i < arr.length; i++) {
            System.out.print("" + arr[i] + " ");
        }
    }
}
