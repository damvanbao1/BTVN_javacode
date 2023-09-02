package BTVN_3;
import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần tìm: ");
        int n = sc.nextInt();

        int count = 0;
        int num= 2;

        do {
            boolean SoNguyenTo= true;
            for (int i=2;i<=Math.sqrt(num);i++){
                if (num%i==0){
                    SoNguyenTo = false;
                    break;
                }
            }
            if (SoNguyenTo){
                System.out.println(num+" ");
                count++;
            }
            num++;
        }while (count<n);





    }
}
