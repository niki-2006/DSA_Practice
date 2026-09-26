import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int pos = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
            }
        }

        if (pos != -1)
            System.out.println("Element found at position " + (pos + 1));
        else
            System.out.println("Element not found");
    }
}