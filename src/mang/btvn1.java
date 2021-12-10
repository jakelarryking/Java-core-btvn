package mang;

public class btvn1 {
    public static void main(String[] args) {
        int array1[] = {1,2,3,4};
        int array2[] = {2,5,7,8};
        int array3[] = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++){
                array3[i] = array1[i];
                array3[i + array1.length] = array2[i];
        }
        System.out.printf("result = [");
        for (int element = 0; element < array3.length-1; element ++){
            System.out.printf("%d,",array3[element]);
        }
        System.out.println(array3[array3.length-1] +"]");
        }
    }
