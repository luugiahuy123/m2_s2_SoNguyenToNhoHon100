package ss2.BaiTap.SoNguyenToNhoHon100;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("nhap so number");
        num = input.nextInt();
        int N = 2;
        while (N < num) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N + " ");
            }
            N++;
        }
    }
}


