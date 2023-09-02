package BTVN_3;

import java.util.Scanner;

public class bai_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so:");
        int num = sc.nextInt();
        int originalnum = num;
        int reversednum =0;
        int raimainder;
        while (num>0){
            raimainder = num%10;
            reversednum = reversednum * 10 + raimainder;
            num /= 10;
        }
        if (originalnum==reversednum){
            System.out.println("la so thuan nghich");
        }
        else {
            System.out.println("khong la so thuan nghich");
        }



    }

}
