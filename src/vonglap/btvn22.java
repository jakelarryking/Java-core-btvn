package vonglap;

import java.util.Scanner;

import java.util.Scanner;

public class btvn22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so nguyen n");
        int n = scan.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=n){
            sum = sum + i;
            i = i+1;
        }
        System.out.println("Tong la " + sum);
        float a = sum/n;
        System.out.println("Trung binh la "+(sum/n));
    }
}
