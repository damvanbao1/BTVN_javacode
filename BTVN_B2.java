
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BTVN_B2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri cua a:");
        float a = scanner.nextFloat();
        System.out.println("nhap gia tri cua b:");
        float b = scanner.nextFloat();
        //bai 1
        System.out.println("Bai 1");
        if (a == 0) {
            System.out.println("phuong trinh ax+b=0 vo nghiem");
            scanner.close();
            return;
        }
        if (a != 0) {
            System.out.println("phuong trinh ax+b=0 co nghiem la:" + (-b) / a);
        }

        //Bai 2
        System.out.println("Bai 2");
        System.out.println("nhap gia tri cua c");
        float c = scanner.nextFloat();
        if (a == 0) {
            System.out.println("phuong trinh co 1 nghiem duy nhat la:" + (-c) / b);
        }
        //tinh delta
        float delta = b * b - 4 * a * c;
        if (delta > 0) {
            System.out.println("phuong trinh co 2 nghiem la:");
            double x1 = ((-b) + Math.sqrt(delta)) / 2 * a;
            double x2 = ((-b) - Math.sqrt(delta)) / 2 * a;
            System.out.println(x1);
            System.out.println(x2);
        }
        if (delta == 0){
            System.out.println("phuong trinh co nghiem kep");
            double x3=-b/(2*a);
            System.out.println(x3);
        }
        if (delta < 0) {
            System.out.println("phuong trinh vo nghiem");
        }

        //BAI 3
        System.out.println("Bai 3");
        System.out.println("chieu dai  la");
        int a1=scanner.nextInt();
        System.out.println("chieu rong la");
        int a2=scanner.nextInt();

        System.out.println("chu vi la:"+(a1+a2)*2);
        System.out.println("dien tich la:"+(a1*a2));

        //Bai 4
        Scanner day= new Scanner(System.in);
        System.out.println("nhap ngay duoi dang:(dd-MM-yyyy)");
        String date1=day.nextLine();
        System.out.print("ngay da nhap"+ date1);
        System.out.println("\nnhap ngay can tinh khoang cach");
        String date2= day.nextLine();
        System.out.print("ngay can tinh khoang cach"+date2);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate1 =LocalDate.parse(date1,dateTimeFormatter);
        LocalDate localDate2 =LocalDate.parse(date2,dateTimeFormatter);
        long dayBetween = ChronoUnit.YEARS.between(localDate1,localDate2);
        System.out.println("so tuoi la:"+dayBetween);

        //Bai 5

        System.out.println("Bai 5a");
        Scanner chuoi=new Scanner(System.in);
        System.out.println("nhap chuoi");
        String c1=chuoi.nextLine();
        System.out.println("ki tu dau cua chuoi la:" );
        System.out.println(c1.charAt(0));

        System.out.println("Bai 5b");
        String s="THAY THE";
        String s1="TH";
        String s2="cut";
        String replace=s.replace(s1,s2);
        System.out.println("chuoi moi"+replace);

        //Bai 6
        System.out.println("Bai 6");
        Scanner tamgiac= new Scanner(System.in);
        double t1=3;
        double t2=12;
        double t3=13;
        System.out.println("sin(C)="+Math.round((double)t1/t3)*100.0/100.0);
        System.out.println("cos(C)"+Math.round((double)t2/t3)*100.0/100.0);

        //Bai 7
        System.out.println("Bai 7");
        Scanner bk= new Scanner(System.in);
        System.out.println("nhap r:");
        double r=bk.nextDouble();
        double cv=Math.round(Math.PI*r)*1000.0/1000.0;
        double dt=Math.round(Math.PI*r*r)*1000.0/1000.0;
        System.out.println("Chu vi hinh tron"+cv);
        System.out.println("Dien tich hinh tron"+dt);











    }
}

