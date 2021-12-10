package mang;

public class btvn2 {
    public static void main(String[] args) {
        int array[]= new int[]{20,20,30,40,50,50,50};
        for (int i = 0; i<array.length; i++){
            while (array[i] == array[i+1]){
                array[i+1] = array[i+2];
            }
        }
    }
}
