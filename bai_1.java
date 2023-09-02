package BTVN_3;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        System.out.println("Bai 1");
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a");
        int a=sc.nextInt();
        System.out.println("nhap b");
        int b=sc.nextInt();
        System.out.println("nhap c");
        int c=sc.nextInt();
        System.out.println("nhap d");
        int d=sc.nextInt();
        int max=a;
        if (max<b) max=b;
        if (max<c) max=c;
        if (max<d) max=d;
        System.out.println("max:"+max);
    }
}
