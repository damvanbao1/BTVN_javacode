package BTVN_3;

import java.util.Scanner;

public class bai_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n:");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            if (i%7==0){
                sum+=i;
            }
        }
        System.out.println("tong cua cac so tu nhin ko lon hon n chia het cho 7 la:"+sum);
    }
}
