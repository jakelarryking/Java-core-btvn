package vonglap;

import java.util.Scanner;

public class btvn1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap so nguyen n");
        int n = scan.nextInt();
        int a = 1;
        int b = 2;
        int i = 3;
        if (n==1){
            System.out.println("1");
        }
        else if(n==2){
            System.out.println("1, 1, 2,");
        }
        else if(n>2){
            System.out.printf("1, 1, 2, ");
            for(;i<n;i = (a+b)){
                System.out.printf(i + ", ");
                a=b;
                b=i;
            }
            if(i==n){
                System.out.printf(i+".");
            }
        }
        else {
            System.out.println("so khong hop le");
        }


    }
}