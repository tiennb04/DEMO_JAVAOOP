package baithuchanh;

import java.util.Scanner;

public class ptbac2 {
    public static void main(String[] args) {
        Scanner dt =  new Scanner(System.in);
        double a,b,c,delta,x1,x2;
        System.out.print("Nhap he so a: ");
        a = dt.nextDouble();
        System.out.print("Nhap he so b: ");
        b = dt.nextDouble();
        System.out.print("Nhap he so c: ");
        c = dt.nextDouble();
        if(a==0){
            System.out.println("Phuong trinh vua nhap la phuong trinh bac nhat");
        }
        else{
            delta = b*b - 4*a*c;
            if(delta>0){
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.printf("\nPhuong trinh co 2 nghiem la: %f va %f",x1,x2);
            }
            else if(delta == 0){
                x1 = -b/(2*a);
                System.out.printf("\nPhuong trinh co 1 nghiem kep la: %f",x1);
            }
            else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}