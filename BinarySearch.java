import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0, high = arr.length - 1;
        int pos = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                pos = mid;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (pos != -1)
            System.out.println("Element found at position " + (pos + 1));
        else
            System.out.println("Element not found");
    }
}