import java.util.Scanner;

public class DecreasingSort {

    public static void main(String[] args) {

        int num;
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        num = input.nextInt();
        int a[] = new int[num];

        System.out.print("Enter an elements:");

        for (int i = 0; i < num; i++) {
            a[i] = input.nextInt();

        }
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("sort in decreasing order");
        for (int i = 0; i < (num - 1); i++) {
            System.out.println(a[i]);

        }
        System.out.println(a[num - 1]);

    }
}