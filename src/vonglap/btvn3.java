package vonglap;

import java.util.Scanner;

public class btvn3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap so nguyen n");
        int n = scan.nextInt();
        String binary = "";
        while (n>=1){
            int a = n % 2;
            binary = a + binary;
            n=n/2;
        }
        System.out.println("So nhi phan la: " + binary);
    }
}