package BTVN_3;

import java.util.Scanner;

public class bai_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n");
        int n= sc.nextInt();
        for (int i=0;i<n;i+=2){
                System.out.print(i+" ");
            }
        System.out.println("\n");
        for (int i=1;i<n;i+=2){
            System.out.print(i+" ");
        }
        }

    }
