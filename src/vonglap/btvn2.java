package vonglap;

import java.util.Scanner;

public class btvn2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so nguyen n");
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i<=n;i=i+1){
            sum = sum + i;
        }
        System.out.println("Tong la: "+sum);
        float a = sum/n;
        System.out.println("Trung binh cong la: " + a);
    }
}
