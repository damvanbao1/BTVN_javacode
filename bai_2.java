package BTVN_3;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n");
        int n=sc.nextInt();
        int dem=0;
        for (int i=1; i<=n ;i++){
            if (n % i==0){
                System.out.println(i);
                dem++;
            }
        }
        System.out.println("So uoc cua"+" "+n +" la "+dem);
    }
}
