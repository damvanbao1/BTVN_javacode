package BTVN_3;

import java.util.Scanner;

public class bai_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap m");
        int m = sc.nextInt();
        System.out.println("nhap n");
        int n = sc.nextInt();
        int a = m;
        int b = n;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }
        if (a == 1) {
            System.out.println("Hai số " + m + " và " + n + " là hai số nguyên tố cùng nhau.");
        } else {
            System.out.println("Hai số " + m + " và " + n + " không là hai số nguyên tố cùng nhau.");
        }
    }
}
