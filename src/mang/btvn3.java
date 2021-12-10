package mang;

public class btvn3 {
    public static void main(String[] args) {
        int[] input = new int[]{49,1,2,200,2,3,4,5,8,9,10};
        int a=1;
        int b=0;
        int c=0;
        for (int i = 0;i<input.length-1; i++){
            if (input[i+1] - input[i] == 1 ) {
                a = a + 1;
            }
            else if(b<a){
                    b=a;
                    a=1;
                    c=i;
            }
            else{
                    a=1;
            }
        }
        System.out.println("Chuoi lien tiep dai nhat la:" + b);
        System.out.printf("Cac phan tu trong chuoi lien tiep la:");
        for (;b>1;b--){
            System.out.printf("%d, ", input[c-b+1]);
        }
        if (b==1){
            System.out.printf("%d.", input[c]);
        }
    }
}
