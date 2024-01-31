package  baithuchanh;

import java.util.Scanner;

public class ptbac1 {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
    double a,b,x;
    System.out.print("Nhap he so a: ");
    a = sc.nextDouble();
    System.out.print("Nhap he so b: ");
    b = sc.nextDouble();
    if(b==0 && a==0){
        System.out.println("He phuong trinh co vo so nghiem");
    }
    else if(a==0 && b!=0){
        System.out.println("He phuong trinh vo nghiem");
    }
    else if(a!=0){
        x = -b/a;
        System.out.printf("He phuong trinh co nghiem duy nhat la: %f",x);
    }
    }
}
