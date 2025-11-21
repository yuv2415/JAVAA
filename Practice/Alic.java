import java.util.Scanner;

public class Alic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int[] A = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
           
            if (A[i] > 0 && A[i] < 20) {
                count++;
            }
        }

        System.out.println(count);
    }
}