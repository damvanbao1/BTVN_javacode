package BTVN_3;

import java.util.Scanner;

public class bai_6 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;
        int originalnum=num;
        for (;num!=0;num/=10){
            int i=num%10;
            sum+=i;
        }
        System.out.println("tong sp cac chu so cua "+originalnum+" la: "+sum);
    }
}
