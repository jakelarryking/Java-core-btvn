package vonglap;

import java.util.Scanner;

public class btvn23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap so nguyen n");
        int n = scan.nextInt();
        float sum = 0;
        int i = 1;
        do {
            sum = sum + i;
            i = i + 1;
        }
        while (i <= n);
        System.out.println("Tong la: " + sum);
        float a = sum/n;
        System.out.println("Trung binh la: " + a);
    }
}