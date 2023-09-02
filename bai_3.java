package BTVN_3;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a");
        int a= sc.nextInt();
        System.out.println("Nhap b");
        int b= sc.nextInt();
        int ucln=1;
        for (int i=1;i<=a;i++){
            if(a % i == 0 && b % i ==0){
                ucln=i;
            }
        }
        int bcnn=(a*b)/ucln;
        System.out.println("ucln cua a va b la: "+ucln);
        System.out.println("bcnn cau a va b la: "+bcnn);
    }
}
